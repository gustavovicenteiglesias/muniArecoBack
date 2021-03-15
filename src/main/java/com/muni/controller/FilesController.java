package com.muni.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.muni.model.Facebook;
import com.muni.model.FileInfo;
import com.muni.service.FacebookServiceApi;
import com.muni.service.FilesStorageService;
import com.muni.upload.message.ResponseMessage;


@Controller
@CrossOrigin("*")
@RequestMapping("/api/home")
public class FilesController {

  @Autowired
  FilesStorageService storageService;
  
  @Autowired
  ServletContext  servletContext;
  
  
  
 
  @PostMapping("/upload/{filename:.+}")
  @PreAuthorize("hasRole('PRENSA')")
  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file, @PathVariable String filename) {
    String message = "";
    try {
      storageService.save(file,filename);

      message = "Uploaded the file successfully: " + file.getOriginalFilename();
      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
    } catch (Exception e) {
      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
    }
  }
 

  @GetMapping("/files")
  @PreAuthorize("hasRole('PRENSA')")
  public ResponseEntity<List<FileInfo>> getListFiles() {
    List<FileInfo> fileInfos = storageService.loadAll().map(path -> {
      String filename = path.getFileName().toString();
      String url = MvcUriComponentsBuilder
          .fromMethodName(FilesController.class, "getFile", path.getFileName().toString()).build().toString();

      return new FileInfo(filename, url);
    }).collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(fileInfos);
  }

  @GetMapping("/files/{filename:.+}")
  public ResponseEntity<Resource> getFile(@PathVariable String filename) {
    Resource file = storageService.load(filename);
    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
  }
  
  	@GetMapping("/delete/{filename:.+}")
  	 public ResponseEntity<ResponseMessage> getFiles(@PathVariable String filename) {
  	   storageService.delete(filename);
  	    return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage("ok"));
  	        
  	  }
  
  
  @GetMapping("/carpeta/{id}")
  	public ResponseEntity<ResponseMessage> data(@PathVariable("id") String id){
	  storageService.carpeta(id);
	  return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage("ok"));
  }
  
  @GetMapping(
		  value = "/imagen/{filename:.+}",
		  produces = MediaType.IMAGE_JPEG_VALUE
		)
  	
  	@ResponseBody
  		public ResponseEntity<Resource> getImageAsResource(@PathVariable String filename) {
      	HttpHeaders headers = new HttpHeaders();
      	Resource file = storageService.load(filename);
      	return new ResponseEntity<>(file, headers, HttpStatus.OK);
  }
}
