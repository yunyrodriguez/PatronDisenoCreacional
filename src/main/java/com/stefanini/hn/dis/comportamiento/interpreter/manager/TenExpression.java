package com.stefanini.hn.dis.comportamiento.interpreter.manager;

import com.stefanini.hn.dis.comportamiento.interpreter.abstracts.Expression;

public class TenExpression extends Expression{

	public String one() {
		return "X";
	}
	
	public String four() {
		return "XL";
	}
	
	public String five() {
		return "L";
	}
	
	public String nine() {
		return "XC";
	}
	
	public int multiplier() {
		return 10;
	}
}
