package com.application.serviceI;

import org.springframework.web.multipart.MultipartFile;

import com.application.model.Student;

public interface StudentServiceInterfaces {

    Student saveData(String studentData, MultipartFile addmissionFile, MultipartFile resultFile);
}
