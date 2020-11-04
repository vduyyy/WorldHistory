package com.example.world.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.world.models.Sites;

@Repository
public interface SitesRepository extends CrudRepository<Sites, Long>{
	List<Sites> findAll();

}
