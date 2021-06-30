package com.example.yaPerfAdmin.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.yaPerfAdmin.model.Adresse;

/**
 * Home object for domain model class Adresse.
 * @see com.ya.performance.dao.Adresse
 * @author Ahmed KECELI
 */

@Repository
public interface AdresseRepository extends CrudRepository<Adresse, Integer> {	
}
