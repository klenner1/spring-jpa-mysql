package com.javaee.klenner.springjpamysql.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaee.klenner.springjpamysql.domain.Garage;
import com.javaee.klenner.springjpamysql.domain.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long>{

	List<Vehicle> findByGarage(Garage garage);
}
