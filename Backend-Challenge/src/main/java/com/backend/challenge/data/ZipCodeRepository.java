package com.backend.challenge.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.backend.challenge.entities.*;

public interface ZipCodeRepository extends CrudRepository<ZipCodeEntity, Integer>{
	
	List<ZipCodeEntity> findByZipCode(String zipCode);
	
}
