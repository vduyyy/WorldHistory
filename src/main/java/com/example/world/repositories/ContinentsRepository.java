package com.example.world.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.world.models.Continents;

@Repository
public interface ContinentsRepository extends CrudRepository<Continents, Long>{
	List<Continents> findAll();
}
