package com.stefanini.hn.dis.comportamiento.chainresponsability.manager;

public class ExecutiveTeamLeader implements IApprover{

	private IApprover next;
	
	public void setNext(IApprover approver) {
		next = approver;
		
	}

	public IApprover getNext() {
		return next;
	}

	public void loanRequest(int rode) {
		if(rode > 10000 && rode <= 50000) {
			System.out.println("Lo manejo yo, el lider");
		}else {
			next.loanRequest(rode);
		}
	}

}
