package com.example.yaPerfAdmin.service;

import java.util.List;

import com.example.yaPerfAdmin.model.Adresse;

public interface AdresseService {

	public Adresse create(Adresse adresse);

	public Adresse findById(Integer IdAdresse);

	public void deleteBydId(Integer idAdresse);

	public List<Adresse> getAllAdresse();

}
