package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.application.model.Student;
import com.application.serviceI.StudentServiceInterfaces;

@RestController
public class StudentController {

	@Autowired
	StudentServiceInterfaces serviceInterfaces;

	@PostMapping("/postStudentData")
	public ResponseEntity<String> postSaveData(@RequestPart("student") String studentData,
			@RequestPart("addmissionFile") MultipartFile addmissionFile,
			@RequestPart("resultFile") MultipartFile resultFile) {

		Student studentDetails = serviceInterfaces.saveData(studentData, addmissionFile, resultFile);
		return new ResponseEntity<>("Student data added", HttpStatus.OK);
	}
	
}
