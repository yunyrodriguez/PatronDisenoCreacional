package com.stefanini.hn.dis.comportamiento.chainresponsability.manager;

public class Director implements IApprover{

	private IApprover next;
	

	public IApprover getNext() {
		return next;
	}

	public void loanRequest(int rode) {
		if(rode >= 100000) {
			System.out.println("Lo manejo yo, el director");
		}
	}

	public void setNext(IApprover approver) {
		// TODO Auto-generated method stub
		
	}

}
