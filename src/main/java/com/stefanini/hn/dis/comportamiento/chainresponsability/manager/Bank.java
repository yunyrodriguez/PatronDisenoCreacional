package com.stefanini.hn.dis.comportamiento.chainresponsability.manager;

public class Bank implements IApprover {

	private IApprover next;
	public void setNext(IApprover approver) {
		next = approver;
	}

	public IApprover getNext() {
		return next;
	}

	public void loanRequest(int rode) {
		AccountExecutive account = new AccountExecutive();
		this.setNext(account);
	    ExecutiveTeamLeader leader = new ExecutiveTeamLeader();
	    account.setNext( leader);
	    Manager manager = new Manager();
	    leader.setNext(manager);
	    Director director = new Director();
	    director.setNext(director);
	    next.loanRequest(rode);
	}

}
