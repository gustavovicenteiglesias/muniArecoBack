package com.muni.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.muni.model.Bunica;



@Transactional
public interface IngTmpRptConMul2BunicaDao extends CrudRepository<Bunica, Integer> {
	@Query(value="SELECT * FROM ing_tmp_rpt_con_mul2_bunica WHERE cuim = ? ORDER BY anio DESC, cuota DESC LIMIT 1",nativeQuery = true)
	 List<Bunica> findByCuim(String cuim);
	
	@Query(value="SELECT * FROM ing_tmp_rpt_con_mul2_bunica WHERE nro_comprob = (SELECT nro_comprob FROM ing_comprob_det_mul_v4_bunica WHERE (recu = '01' OR recu = '02' OR recu = '020') AND imponible = ? ORDER BY id DESC LIMIT 1) ORDER BY anio DESC, cuota DESC LIMIT 1",nativeQuery = true)
	List<Bunica> findByInmueble(Integer nroInmueble);
	
	@Query(value="SELECT * FROM ing_tmp_rpt_con_mul2_bunica WHERE nro_comprob = (SELECT nro_comprob FROM ing_comprob_det_mul_v4_bunica WHERE recu = '03' AND imponible = ? ORDER BY fecha_deu DESC LIMIT 1) ORDER BY anio DESC, cuota DESC LIMIT 1",nativeQuery = true)
	List<Bunica> findByComercio(Integer nroComercio);
	
	@Query(value="SELECT * FROM ing_tmp_rpt_con_mul2_bunica WHERE nro_comprob_anual = (SELECT nro_comprob FROM ing_comprob_det_mul_v4a_bunica WHERE recu = '30' AND info_imponible LIKE ? ORDER BY nro_comprob DESC LIMIT 1) ORDER BY anio DESC, cuota DESC LIMIT 1",nativeQuery = true)
	List<Bunica> findByDominio(String nroComercio);
	
	@Query(value="SELECT * FROM ing_tmp_rpt_con_mul2_bunica WHERE cuim = ? AND anio = ? AND cuota = ?",nativeQuery = true)
	Bunica buscarporCuim (String cuim,Integer anio,Integer cuota);
	
	

}
