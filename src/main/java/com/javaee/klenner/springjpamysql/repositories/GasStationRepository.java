package com.javaee.klenner.springjpamysql.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaee.klenner.springjpamysql.domain.Garage;
import com.javaee.klenner.springjpamysql.domain.GasStation;

@Repository
public interface GasStationRepository extends CrudRepository<GasStation, Long>{

	List<GasStation> findByGarage(Garage garage);
}
