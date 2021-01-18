package com.muni.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.muni.model.Sanear;

public interface SanearApi extends CrudRepository<Sanear, Integer> {
	List<Sanear> findByCuim(String cuim);
	List<Sanear> findByNroInmueble(Integer nro_inmueble);
}
