package com.muni.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.muni.model.IngTmpRptComTc2;


@Transactional

public interface IngTmoRptComTc2Dao extends CrudRepository<IngTmpRptComTc2,Integer > {
	@Query(value="SELECT * FROM ing_tmp_rpt_com_tc2 WHERE cuim = ? AND anio > 2016 ORDER BY anio DESC, cuota DESC LIMIT 1",nativeQuery = true)
	List<IngTmpRptComTc2> findByCuim(String cuim);
	
	@Query(value="SELECT * FROM ing_tmp_rpt_com_tc2 WHERE nro_comercio = ? ORDER BY anio DESC, cuota DESC LIMIT 1",nativeQuery = true)
	List<IngTmpRptComTc2> findBynroComercio(Integer nroComercio);
	
	

}
