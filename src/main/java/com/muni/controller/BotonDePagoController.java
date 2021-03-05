package com.muni.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.muni.model.BotonDePago;
import com.muni.model.Bunica;
import com.muni.service.IngTmpRptConMul2BunicaService;
import com.muni.service.IngTmpRptConMulBunicaApi;
import com.pluspagos.AESEncrypter;
import com.pluspagos.SHA256Firm;
import com.pluspagos.model.FormularioModel;





@Controller
@RequestMapping(value = "/api/boton")
@CrossOrigin("*")
public class BotonDePagoController {
	
	@Autowired
	IngTmpRptConMulBunicaApi ingTmpRptConMulBunicaApi ;
	
	
	
	@PostMapping("/boton")
	 public String hola(Model modelo,@RequestBody BotonDePago dato) throws GeneralSecurityException, IOException {
		BotonDePago data=new BotonDePago();
		data=dato;
		Bunica bunica=new Bunica();
		bunica=ingTmpRptConMulBunicaApi.findById(data.getId()).get();
		//ingTmpRptConMul2BunicaService.buscarporCuim(data.getCuim(), data.getAnio(), data.getCuota());
		Integer transaccion1=bunica.getTransaccion();
		String cod50cuota=bunica.getCod50cuota();
		String transaccion= bunica.getTransaccion()+"";
		transaccion1=transaccion1+1;
		bunica.setTransaccion(transaccion1);
		ingTmpRptConMulBunicaApi.save(bunica);	 
		System.out.println(bunica.toString());
		System.out.println(transaccion1);
		
		String secretKey = "MUNICIPALIDADDESANANTONIODEARECO_0a4dc276-d26d-4afc-9ef1-72625ea367c4";
		String guidComercio = "cd62b543-0559-4b7b-bd7d-558d8b87d84c";
		//String ip = "186.33.235.85";
		URL url = new URL("http://checkip.amazonaws.com");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
			url.openStream()));
			String ip = reader.readLine().trim();
			reader.close();
		
		String monto = AESEncrypter.encryptString(data.getMonto_total()+"", secretKey);
		String callbackSuccess = AESEncrypter.encryptString("areco.gob.ar", secretKey);
		String callbackCancel = AESEncrypter.encryptString("areco.gob.ar", secretKey);
		String sucursalComercio = AESEncrypter.encryptString("", secretKey);
		String sucursal="";
		Integer transaccion_priceitem=(int) (data.getMonto_total()*100);
		String transaccionId=cod50cuota+transaccion;//data.getNro_transaccion();
		String hashfinal=new SHA256Firm().getFirm(ip, secretKey, guidComercio, sucursal, monto);
	    System.out.println(data.toString());
	    System.out.println(bunica.getTransaccion());
	    System.out.println(transaccionId);
	    System.out.println(ip);
	    modelo.addAttribute("callbackEncriptada",callbackSuccess);
	    modelo.addAttribute("cancelEncriptada",callbackCancel);
	    modelo.addAttribute("sucursalEncriptada",sucursalComercio);
	    modelo.addAttribute("comercio",guidComercio);
	    //modelo.addAttribute("sucursalEncriptada",sucursalComercio);
	    modelo.addAttribute("transaccion_numero",transaccionId);
	    modelo.addAttribute("montoEncriptado", monto);
	    modelo.addAttribute("transaccion_item",bunica.getCuota()+"/"+bunica.getAnio());
	    modelo.addAttribute("transaccion_priceitem",transaccion_priceitem);
	    modelo.addAttribute("hashfinal",hashfinal);
	    
	    
	    return "BotonPago";
	  }
	
	
	@GetMapping(value = "/pago")
	public String hello () {
		
		return  "Hola";
	}
	
	
}
