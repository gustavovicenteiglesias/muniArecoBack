package com.muni.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muni.dao.SanearDao;
import com.muni.model.Sanear;


@Service
public class SanearService implements SanearDao {
	
	@Autowired
	SanearDao sanearDao;

	@Override
	public <S extends Sanear> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sanear> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Sanear> findById(Integer id) {
		// TODO Auto-generated method stub
		return sanearDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return sanearDao.existsById(id);
	}

	@Override
	public Iterable<Sanear> findAll() {
		// TODO Auto-generated method stub
		return sanearDao.findAll();
	}

	@Override
	public Iterable<Sanear> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return sanearDao.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sanear entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Sanear> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Sanear> findByCuim(String cuim) {
		// TODO Auto-generated method stub
		return sanearDao.findByCuim(cuim);
	}

	@Override
	public List<Sanear> findByNroInmueble(Integer nro_inmueble) {
		// TODO Auto-generated method stub
		return sanearDao.findByNroInmueble(nro_inmueble);
	}

	
	


}
