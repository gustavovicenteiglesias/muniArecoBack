package com.muni.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muni.dao.IngTmoRptComTc2Dao;
import com.muni.model.IngTmpRptComTc2;
import com.muni.model.Bunica;
@Service
public class IngTmpRptComTc2Service implements IngTmpRptComTc2Api {
	
	@Autowired
	IngTmoRptComTc2Dao ingTmoRptComTc2Dao ;
	
	@Override
	public <S extends IngTmpRptComTc2> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends IngTmpRptComTc2> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<IngTmpRptComTc2> findById(Integer id) {
		// TODO Auto-generated method stub
		return ingTmoRptComTc2Dao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<IngTmpRptComTc2> findAll() {
		// TODO Auto-generated method stub
		return ingTmoRptComTc2Dao.findAll();
	}

	@Override
	public Iterable<IngTmpRptComTc2> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return ingTmoRptComTc2Dao.findAllById(ids);
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
	public void delete(IngTmpRptComTc2 entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends IngTmpRptComTc2> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IngTmpRptComTc2> findBynroComercio(Integer nroComercio) {
		// TODO Auto-generated method stub
		return ingTmoRptComTc2Dao.findBynroComercio(nroComercio);
	}

	@Override
	public List<IngTmpRptComTc2> findByCuim(String cuim) {
		// TODO Auto-generated method stub
		return ingTmoRptComTc2Dao.findByCuim(cuim);
	}

}
