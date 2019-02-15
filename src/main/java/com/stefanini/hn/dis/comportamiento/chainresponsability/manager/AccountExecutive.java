package com.stefanini.hn.dis.comportamiento.chainresponsability.manager;

public class AccountExecutive implements IApprover{

	private IApprover next;

	public void setNext(IApprover approver) {
		next = approver;	
	}

	public IApprover getNext() {
		return next;
	}

	public void loanRequest(int rode) {
		if (rode <= 10000) {
			System.out.println("Lo manejo yo, el ejecutivo de cuentas");
		}
		else {
			next.loanRequest(rode);
		}
	}

}
