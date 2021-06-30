package com.example.yaPerfAdmin.repository;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.yaPerfAdmin.model.Prospect;

@Repository
public interface ProspectRepository extends CrudRepository<Prospect, Serializable>{
	
}
