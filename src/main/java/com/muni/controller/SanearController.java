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


import com.muni.model.Sanear;
import com.muni.service.SanearApi;

@RestController
@RequestMapping(value = "/api/sanear/")
@CrossOrigin("*")

public class SanearController {

	@Autowired
	SanearApi sanearApi;
	
	
	@GetMapping(value="/all")
	public Map<String, Object> list(){
		
		HashMap<String,Object> response = new HashMap<String,Object>();
		
		try { 
			List<Sanear> bunicalist; 
			bunicalist = (List<Sanear>) sanearApi.findAll();
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
				List<Sanear> bunicalist; 
				bunicalist = sanearApi.findByCuim(id);
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
				List<Sanear> bunicalist; 
				bunicalist = sanearApi.findByNroInmueble(id);
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
