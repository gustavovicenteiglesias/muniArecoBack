package com.muni.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muni.model.Facebook;
import com.muni.service.FacebookServiceApi;

@RestController
@RequestMapping(value = "/api/facebook/")
@CrossOrigin("*")
public class FacebookController {
	@Autowired
	  FacebookServiceApi facebookServiceApi;
	  @GetMapping("/ultimo")
	  public Map<String, Object> data() {
			HashMap<String, Object> response = new HashMap<String, Object>();

			try {

				Optional<Facebook> face =facebookServiceApi.findUltimo();
				System.out.println(face.toString());
				if (face.isPresent()) {
					response.put("message", "Successful load");
					response.put("data", face);
					response.put("success", true);
					return response;
				} else {
					response.put("message", "Not found data");
					response.put("data", null);
					response.put("success", false);
					return response;
				}

			} catch (Exception e) {
				response.put("message", "" + e.getMessage());
				response.put("success", false);
				return response;
			}
		}
	  
	  @PostMapping(value = "/facebook/create")
	  @PreAuthorize("hasRole('PRENSA')")
		public ResponseEntity<String> create(@RequestBody Facebook data) {

			try {
				System.out.print("Proceso de guardar datos");
				facebookServiceApi.save(data);
				return new ResponseEntity<>("Save successful ", HttpStatus.OK);
			} catch (Exception e) {
				System.out.print(e);
				return new ResponseEntity<>("" + e, HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}
}
