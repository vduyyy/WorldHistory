package com.example.world.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.world.models.Sites;
import com.example.world.repositories.SitesRepository;



@Service
public class SitesServices {
	
	private final SitesRepository siteRepo;
	
	public SitesServices(SitesRepository siteRepo) {
		this.siteRepo = siteRepo;
	}
	
	public Sites createSite(Sites site) {
		return siteRepo.save(site);
	}
	
	public List<Sites> allSites(){
		return siteRepo.findAll();
	}
	
	public Optional<Sites> getSite(Long id) {
		return siteRepo.findById(id);
	}
	
	public Sites findOne(Long id) {
		Optional<Sites> optional = siteRepo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

}