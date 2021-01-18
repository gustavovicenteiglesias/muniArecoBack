package com.muni.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.muni.model.Bunica;
import com.muni.model.Sanear;

@Transactional
public interface SanearDao extends CrudRepository<Sanear, Integer> {
	List<Sanear> findByCuim(String cuim);
	List<Sanear> findByNroInmueble(Integer nro_inmueble);

}
