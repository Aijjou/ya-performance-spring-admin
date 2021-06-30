package com.example.yaPerfAdmin.service;

import java.util.List;

import com.example.yaPerfAdmin.model.Simulation;

public interface SimulationService {

	
	
	public Simulation create(Simulation simulation);
	public Simulation findById(Integer idSimulation);
	public void deleteById(Integer idSimulation);
	public List<Simulation> findAllSimulation();
	
	
	
}


