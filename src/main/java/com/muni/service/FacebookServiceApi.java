package com.muni.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.muni.model.Facebook;

public interface FacebookServiceApi extends CrudRepository<Facebook, Integer> {
	@Query(value="select * from facebook ORDER by id DESC LIMIT 1",nativeQuery = true)
	Optional<Facebook> findUltimo();
}
