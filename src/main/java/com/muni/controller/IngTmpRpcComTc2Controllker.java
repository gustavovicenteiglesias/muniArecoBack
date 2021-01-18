package com.muni.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muni.model.IngTmpRptComTc2;
import com.muni.model.Bunica;
import com.muni.model.Sanear;
import com.muni.service.IngTmpRptComTc2Api;

@RestController
@RequestMapping(value = "/api/comercio/")
@CrossOrigin("*")

public class IngTmpRpcComTc2Controllker {

	@Autowired
	IngTmpRptComTc2Api ingTmpRptComTc2Api;
	

	@GetMapping(value="/all")
	public Map<String, Object> list(){
		
		HashMap<String,Object> response = new HashMap<String,Object>();
		
		try { 
			List<IngTmpRptComTc2> bunicalist; 
			bunicalist = (List<IngTmpRptComTc2>) ingTmpRptComTc2Api.findAll();
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
	
	public Map<String, Object> findByComercio(@PathVariable int id) {
		
		
			
			HashMap<String,Object> response = new HashMap<String,Object>();
			
			try { 
				List<IngTmpRptComTc2> bunicalist; 
				bunicalist = ingTmpRptComTc2Api.findBynroComercio(id);
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
	
	
@GetMapping(value = "/cuim/{id}")
	
	public Map<String, Object> findByCuim(@PathVariable String id) {
		
		
			
			HashMap<String,Object> response = new HashMap<String,Object>();
			
			try { 
				List<IngTmpRptComTc2> bunicalist; 
				bunicalist = ingTmpRptComTc2Api.findByCuim(id);
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
