package com.backend.challenge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.challenge.data.ZipCodeRepository;
import com.backend.challenge.entities.ZipCodeEntity;
import com.backend.challenge.pojo.Settlement;
import com.backend.challenge.pojo.ZipCode;

@RestController
@RequestMapping("zip-codes")
public class ZipCodeController {
	
	@Autowired
	ZipCodeRepository repository;
	
	@GetMapping(value="/{zipcode}", produces = "application/json")
	public ZipCode getDetails(@PathVariable int zipcode) {
		ZipCode result = new ZipCode();		
		
		List<ZipCodeEntity> lista = repository.findByZipCode( String.valueOf(zipcode) );				
				
		if( !lista.isEmpty() ) {
			
			List<Settlement> setts = new ArrayList<Settlement>(); 
					
			for( ZipCodeEntity r : lista ) {
				//System.out.println( r.getSettlement() );
				setts.add( new Settlement(r.getSettlement(), r.getSettlementType()) );
			}
			
			result.setZipCode( lista.get(0).getZipCode() );
			result.setFederalEntity( lista.get(0).getFederalEntity() );
			result.setMunicipality( lista.get(0).getMunicipality() );
			result.setLocality( lista.get(0).getLocality() );							
			result.setSettlements( setts );
		}		
		else
			result.setZipCode("No match");
		
		return result;
	}

}
