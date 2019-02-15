package com.stefanini.hn.dis.comportamiento.chainresponsability.manager;

public class Manager implements IApprover {

	private IApprover next;
	public void setNext(IApprover approver) {
		next = approver;
	}

	public IApprover getNext() {
		return next;
	}

	public void loanRequest(int rode) {
		if(rode > 50000 && rode <= 100000) {
			System.out.println("Lo manejo yo, el Gerente");
		}else {
			next.loanRequest(rode);
		}
	}

}
