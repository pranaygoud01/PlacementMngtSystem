package com.example.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Certificate;
import com.example.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService {

	
	@Autowired
	CertificateRepository certificateRepository;
	
	@Override
	public Certificate saveCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		return certificateRepository.save(certificate);
		
		
	}
	@Override
	public List <Certificate> fetchCertificateList() {
		
		return certificateRepository.findAll();
	}
	@Override
	public Certificate fetchCertificateById(Long certificateId) {
		
		return certificateRepository.findById(certificateId).get();
	}
	@Override
	public void deleteCertificateById(Long certificateId) {
		
		certificateRepository.deleteById(certificateId);
		
		
	}
	public Certificate updateCertificate(Long certificateId, Certificate certificate) {
		
		Certificate certificateDB = certificateRepository.findById(certificateId).get();
		
		if(Objects.nonNull(certificate.getYear()) &&
			       !"".equals(certificate.getYear())) {
			           certificateDB.setYear(certificate.getYear());
			       }

			      
			       if(Objects.nonNull(certificate.getCollege()) &&
			               !"".equalsIgnoreCase(certificate.getCollege())) {
			           certificateDB.setCollege(certificate.getCollege());
			       }

			       return certificateRepository.save(certificateDB);
		
		
		
	}


}
