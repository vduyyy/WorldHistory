package com.example.world.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.world.models.Continents;
import com.example.world.repositories.ContinentsRepository;

@Service
public class ContinentsService {
	
	private final ContinentsRepository continentRepo;
	
	public ContinentsService(ContinentsRepository continentRepo) {
		this.continentRepo = continentRepo;
	}
	
	
		
	public Continents createContinents(Continents continents) {
		return continentRepo.save(continents);
	}
	
	public List<Continents> allContinents(){
		return continentRepo.findAll();
	}
	
	public Optional<Continents> getContinent(Long id){
		return continentRepo.findById(id);
	}
}
