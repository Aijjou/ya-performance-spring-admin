package com.example.yaPerfAdmin.repository;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.yaPerfAdmin.model.Simulation;

/**
 * Home object for domain model class Simulation.
 * @see com.ya.performance.dao.Simulation
 * @author Ahmed KECELI
 */

@Repository
public interface SimulationRepository extends CrudRepository<Simulation, Serializable> {

}
