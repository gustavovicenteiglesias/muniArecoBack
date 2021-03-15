package com.muni.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.muni.model.Facebook;
@Transactional
public interface FacebookDao extends CrudRepository<Facebook, Integer> {
	@Query(value="select * from facebook ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Facebook> findUltimo();
}
