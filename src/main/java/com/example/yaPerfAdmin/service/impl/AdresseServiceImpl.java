package com.example.yaPerfAdmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yaPerfAdmin.model.Adresse;
import com.example.yaPerfAdmin.repository.AdresseRepository;
import com.example.yaPerfAdmin.service.AdresseService;

@Service
public class AdresseServiceImpl implements AdresseService {

	@Autowired
	AdresseRepository adresseRepository;

	@Override
	public Adresse create(Adresse adresse) {

		return adresseRepository.save(adresse);
	}

	@Override
	public Adresse findById(Integer idAdresse) {

		return adresseRepository.findById(idAdresse).get();
	}

	@Override
	public void deleteBydId(Integer idAdresse) {
		adresseRepository.deleteById(idAdresse);

	}

	@Override
	public List<Adresse> getAllAdresse() {
		
		return (List<Adresse>) adresseRepository.findAll();
	}

}
