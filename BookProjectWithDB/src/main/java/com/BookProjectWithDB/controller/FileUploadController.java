package com.BookProjectWithDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.BookProjectWithDB.helper.FileUploadHelper;

@RestController
public class FileUploadController {
	
	@Autowired
	private FileUploadHelper fileUploadHelper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file){
		
		try {		
		 String mimeType = file.getContentType();
		
		//validation
		if(file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must not be EMPTY...");
		}
		
		if(! mimeType.equals("image/jpeg")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Type must be .jpg");
		}
		
		
//		long fileSize = file.getSize();
//		long fileSizeInKb =(fileSize/1024);
//		
//		if(fileSizeInKb > 128) {
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File Size Must be LESS than 5MB...");
//		}
		
		
		System.out.println(mimeType);
		System.out.println("File Name :"+file.getOriginalFilename());
		System.out.println("File Size :"+file.getSize());
		
		
		//Uploading File
		boolean f = fileUploadHelper.uploadFile(file);
		
		if(f) {
			return ResponseEntity.ok("File Uploaded Successfully...");
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong...");
	}
}
