package com.example.world.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.world.models.Countries;

@Repository
public interface CountriesRepository extends CrudRepository<Countries, Long>{
	List<Countries> findAll();

}
