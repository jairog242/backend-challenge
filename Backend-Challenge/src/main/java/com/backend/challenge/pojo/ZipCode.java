package com.backend.challenge.pojo;

import java.util.List;

public class ZipCode {

	private String zipCode; 					// CodigoPostal
	private String federalEntity;			// Estado
	private String municipality;			// Municipio
	private String locality;				// Ciudad-Localidad
	private List<Settlement> settlements;	// Asentamientos
	
	
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
	public List<Settlement> getSettlements() {
		return settlements;
	}
	public void setSettlements(List<Settlement> settlements) {
		this.settlements = settlements;
	}
	
	@Override
	public String toString() {
		return "ZipCode [zipCode=" + zipCode + ", federalEntity=" + federalEntity + ", municipality="
				+ municipality + ", locality=" + locality + ", settlements=" + settlements + "]";
	}
			
}
