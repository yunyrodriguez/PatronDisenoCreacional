package com.stefanini.hn.dis.comportamiento.interpreter.manager;

import com.stefanini.hn.dis.comportamiento.interpreter.abstracts.Expression;

public class ThousandExpression extends Expression{

	public String one() {
		return "M";
	}
	
	public String four() {
		return " ";
	}
	
	public String five() {
		return " ";
	}
	
	public String nine() {
		return " ";
	}
	
	public int multiplier() {
		return 1000;
	}
	
}
