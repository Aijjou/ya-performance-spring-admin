package com.example.yaPerfAdmin.service;

import org.springframework.http.ResponseEntity;

import com.example.yaPerfAdmin.model.Prospect;

public interface ProspectService {
	
	public Iterable<Prospect> getAllProspects();
	
	
	public Prospect createOrSaveProspect(Prospect p);
	
	public Prospect getProspectById(Integer id);
	
	public Prospect updateProspect(Prospect updatedPros, Integer id) ;
	
	public ResponseEntity<?> deleteProspect(Integer id);
	
	
	
	
	
}
