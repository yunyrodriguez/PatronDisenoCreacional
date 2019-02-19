package com.stefanini.hn.dis.estructural.facade.manager;

public class RealEstate {

	private ShowProperty showProperty;
	private RealEstateSale realEstateSale;
	private AccountsPayable accountsPayable;
	private RentalAdministration rentalAdministration;

	public RealEstate() {
		showProperty = new ShowProperty();
		realEstateSale = new RealEstateSale();
		accountsPayable = new AccountsPayable();
		rentalAdministration = new RentalAdministration();
	}
	
	public void customerCare(ClientFacade c) {
		System.out.println("Atendiendo a un cliente");
	}
	
	public void ownerAttention(Propetary p) {
		System.out.println("Atendiendo a un propetario");
	}

	public void interestedAttention(Interested i) {
		System.out.println("Atencion a un interesado en una propiedad");
	}
	
	public void attention(PersonFacade person) {
		if(person instanceof ClientFacade) {
			customerCare((ClientFacade)person);
		}else if (person instanceof Propetary) {
			ownerAttention((Propetary)person);
		}else {
			interestedAttention((Interested)person);
		}
	}
}
