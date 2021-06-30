package com.example.yaPerfAdmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.yaPerfAdmin.model.Simulation;
import com.example.yaPerfAdmin.repository.SimulationRepository;
import com.example.yaPerfAdmin.service.SimulationService;

public class SimulationServiceImpl implements SimulationService {

	@Autowired
	SimulationRepository simulationReposotory;

	@Override
	public Simulation create(Simulation simulation) {

		return simulationReposotory.save(simulation);
	}

	@Override
	public Simulation findById(Integer idSimulation) {

		return simulationReposotory.findById(idSimulation).get();
	}

	@Override
	public void deleteById(Integer idSimulation) {
		simulationReposotory.deleteById(idSimulation);

	}

	public List<Simulation> findAllSimulation() {
		
		return (List<Simulation>) simulationReposotory.findAll();
	}

}
