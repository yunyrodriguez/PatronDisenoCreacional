package com.stefanini.hn.dis.comportamiento.templatemethod.manager;

public class PartnerTemplate extends PersonTemplate {

	private int numberOfPartner;
	
	public PartnerTemplate(int numberOfPartner) {
		setNumberOfPartner(numberOfPartner);
	}

	@Override
	protected String getId() {
		return String.valueOf(numberOfPartner);
	}

	@Override
	protected String getTypeId() {
		return "Numero de Socio";
	}

	public int getNumberOfPartner() {
		return numberOfPartner;
	}

	public void setNumberOfPartner(int numberOfPartner) {
		this.numberOfPartner = numberOfPartner;
	}

}
