package com.muni;



import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.muni.service.FilesStorageService;




@SpringBootApplication
public class Boleta3Application {
	@Resource
	 FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(Boleta3Application.class, args);
	}
	
}
