package com.example.service;

import java.util.List;

import com.example.entity.Certificate;

public interface CertificateService{

	Certificate saveCertificate(Certificate certificate);

	List<Certificate> fetchCertificateList();

	Certificate fetchCertificateById(Long certificateId);

	void deleteCertificateById(Long certificateId);

	Certificate updateCertificate(Long certificateId, Certificate certificate);
	

}
