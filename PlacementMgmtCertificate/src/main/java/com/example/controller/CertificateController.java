package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.example.entity.Certificate;

import com.example.service.CertificateService;

@RestController
public class CertificateController {
	
	@Autowired
	CertificateService certificateService;
	
	@PostMapping("/certificate")
	public  Certificate saveCertificate(@RequestBody Certificate certificate) {

	  return certificateService.saveCertificate(certificate);
	  
	}
	@GetMapping("/certificate")
	public List <Certificate> fetchCertificateList(){
		
	
			return certificateService.fetchCertificateList();
	
	}
	
	
	@GetMapping("/certificate/{id}")
	public Certificate fetchCertificateById(@PathVariable("id") Long certificateId ) {
		return certificateService.fetchCertificateById(certificateId);
	}
	@DeleteMapping("/certificate/{id}")
	
	public String deleteCertificateById(@PathVariable("id") Long certificateId) {
		
		certificateService.deleteCertificateById(certificateId);
		
		return "Certificate id deleted succesfully";	
	}
	
	
	 @PutMapping("/certificate/{id}") 
	 public Certificate updateCertificate(@PathVariable("id") Long certificateId, @RequestBody
	  Certificate certificate) { 
		  return certificateService.updateCertificate(certificateId,certificate); 
	 }
	  
	 

//	    @PutMapping("/departments/{id}")
//	    public Department updateDepartment(@PathVariable("id") Long departmentId,
//	                                       @RequestBody Department department) {
//	        return departmentService.updateDepartment(departmentId,department);
//	    }

}