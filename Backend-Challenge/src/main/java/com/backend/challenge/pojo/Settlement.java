package com.backend.challenge.pojo;

/* Asentamiento */
public class Settlement {
	private String name;
	private String settlementType;
	
	public Settlement() {		
	}
	
	public Settlement(String name, String settlementType) {
		this.name = name;
		this.settlementType = settlementType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSettlementType() {
		return settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}
	
}
