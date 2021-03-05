package com.muni.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muni.dao.IngTmpRptConMul2BunicaDao;
import com.muni.model.Bunica;

@Service

public class IngTmpRptConMul2BunicaService implements IngTmpRptConMulBunicaApi {
	
	@Autowired
	IngTmpRptConMul2BunicaDao ingTmpRptConMul2BunicaDao;

	@Override
	public <S extends Bunica> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bunica> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Bunica> findById(Integer id) {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Bunica> findAll() {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.findAll();
	}

	@Override
	public Iterable<Bunica> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.findAllById(ids);
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
	public void delete(Bunica entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Bunica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bunica> findByCuim(String cuim) {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.findByCuim(cuim);
	}

	@Override
	public List<Bunica> findByInmueble(Integer nroInmueble) {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.findByInmueble(nroInmueble);
	}

	@Override
	public List<Bunica> findByComercio(Integer nroComercio) {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.findByComercio(nroComercio);
	}

	@Override
	public List<Bunica> findByDominio(String nroComercio) {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.findByDominio(nroComercio);
	}

	@Override
	public Bunica buscarporCuim(String cuim, Integer anio, Integer cuota) {
		// TODO Auto-generated method stub
		return ingTmpRptConMul2BunicaDao.buscarporCuim(cuim, anio, cuota);
	}

	

	
	
	

}
