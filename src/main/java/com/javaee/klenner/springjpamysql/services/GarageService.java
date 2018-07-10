package com.javaee.klenner.springjpamysql.services;


import java.util.List;

import com.javaee.klenner.springjpamysql.api.v1.model.GarageDTO;

public interface GarageService {

	List<GarageDTO> getAll();

	GarageDTO getById(Long id);

	GarageDTO createNew(GarageDTO garage);

	GarageDTO save(Long id, GarageDTO garage);

	void deleteById(Long id);

}
