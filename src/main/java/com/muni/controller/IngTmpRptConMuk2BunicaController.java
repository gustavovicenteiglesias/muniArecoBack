package com.muni.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muni.dao.IngTmpRptConMul2BunicaDao;
import com.muni.model.Bunica;
import com.muni.model.Sanear;
import com.muni.service.IngTmpRptConMul2BunicaService;
import com.muni.service.IngTmpRptConMulBunicaApi;



@RestController
@RequestMapping(value = "/api/bunica/")
@CrossOrigin("*")
public class IngTmpRptConMuk2BunicaController {
	@Autowired
	IngTmpRptConMulBunicaApi ingTmpRptConMulBunicaApi ;
	
	
	
	@GetMapping(value="/all")
	public Map<String, Object> list(){
		
		HashMap<String,Object> response = new HashMap<String,Object>();
		
		try { 
			List<Bunica> bunicalist; 
			bunicalist = (List<Bunica>) ingTmpRptConMulBunicaApi.findAll();
			response.put("message","Successful load");
			response.put("data",bunicalist);
			response.put("success",true);
			return response;
			
		} catch (Exception e) {  
			response.put("message",e.getMessage()); 
			response.put("success ",false);
			return response;
		}
		
	}
	
	@GetMapping(value = "/cuim/{id}")
	
	public Map<String, Object> findByCuim(@PathVariable String id) {
		
		
			
			HashMap<String,Object> response = new HashMap<String,Object>();
			
			try { 
				List<Bunica> bunicalist; 
				bunicalist = ingTmpRptConMulBunicaApi.findByCuim(id);
				System.out.print(bunicalist.toString());
				response.put("message","Successful load");
				response.put("data",bunicalist);
				response.put("success",true);
				return response;
				
			} catch (Exception e) {  
				response.put("message",e.getMessage()); 
				response.put("success ",false);
				return response;
			}
	

}
	@GetMapping(value = "/inmueble/{id}")
	
	public Map<String, Object> findByInmueble(@PathVariable Integer id) {
		
		
			
			HashMap<String,Object> response = new HashMap<String,Object>();
			
			try { 
				List<Bunica> bunicalist; 
				bunicalist = ingTmpRptConMulBunicaApi.findByInmueble(id);
				System.out.print(bunicalist.toString());
				response.put("message","Successful load");
				response.put("data",bunicalist);
				response.put("success",true);
				return response;
				
			} catch (Exception e) {  
				response.put("message",e.getMessage()); 
				response.put("success ",false);
				return response;
			}
	

}
@GetMapping(value = "/comercio/{id}")
	
	public Map<String, Object> findByComercio(@PathVariable Integer id) {
		
		
			
			HashMap<String,Object> response = new HashMap<String,Object>();
			
			try { 
				List<Bunica> bunicalist; 
				bunicalist = ingTmpRptConMulBunicaApi.findByComercio(id);
				System.out.print(bunicalist.toString());
				response.put("message","Successful load");
				response.put("data",bunicalist);
				response.put("success",true);
				return response;
				
			} catch (Exception e) {  
				response.put("message",e.getMessage()); 
				response.put("success ",false);
				return response;
			}
	

}

@GetMapping(value = "/dominio/{id}")

public Map<String, Object> findByDominio(@PathVariable String id) {
	
	
		
		HashMap<String,Object> response = new HashMap<String,Object>();
		
		try { 
			List<Bunica> bunicalist; 
			bunicalist = ingTmpRptConMulBunicaApi.findByDominio(id);
			System.out.print(bunicalist.toString());
			response.put("message","Successful load");
			response.put("data",bunicalist);
			response.put("success",true);
			return response;
			
		} catch (Exception e) {  
			response.put("message",e.getMessage()); 
			response.put("success ",false);
			return response;
		}


}
	
}
