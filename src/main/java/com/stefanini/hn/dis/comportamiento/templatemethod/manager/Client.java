package com.stefanini.hn.dis.comportamiento.templatemethod.manager;

public class Client extends PersonTemplate{

	private int numberOfClient;
	
	public Client(int numberOfClient) {
		
		setNumberOfClient(numberOfClient);
	}

	@Override
	protected String getId() {
		return String.valueOf(numberOfClient);
	}

	@Override
	protected String getTypeId() {
		return "Numero de cliente";
	}

	public int getNumberOfClient() {
		return numberOfClient;
	}

	public void setNumberOfClient(int numberOfClient) {
		this.numberOfClient = numberOfClient;
	}

	
}
