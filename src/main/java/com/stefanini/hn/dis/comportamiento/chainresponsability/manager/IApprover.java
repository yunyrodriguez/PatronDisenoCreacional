package com.stefanini.hn.dis.comportamiento.chainresponsability.manager;

public interface IApprover {

	public void setNext(IApprover approver);
    public IApprover getNext();
    public void loanRequest(int rode);
}
