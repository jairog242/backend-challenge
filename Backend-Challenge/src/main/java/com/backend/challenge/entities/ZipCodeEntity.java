package com.backend.challenge.entities;

import javax.persistence.*;

@Entity
@Table(name = "zip_codes")
public class ZipCodeEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_zipcode")
	private Integer id;
	
	@Column(name="zip_code")
	private String zipCode; 				// CodigoPostal
	
	@Column(name="federal_entity")
	private String federalEntity;			// Estado
	
	@Column(name="municipality")
	private String municipality;			// Municipio
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="settlement")
	private String settlement;
	
	@Column(name="settlement_type")
	private String settlementType;
	
	@Column(name="clave_oficina")
	private String claveOficina;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getFederalEntity() {
		return federalEntity;
	}
	public void setFederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	public String getSettlement() {
		return settlement;
	}
	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}
	public String getSettlementType() {
		return settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}
	public String getClaveOficina() {
		return claveOficina;
	}
	public void setClaveOficina(String claveOficina) {
		this.claveOficina = claveOficina;
	}

}
