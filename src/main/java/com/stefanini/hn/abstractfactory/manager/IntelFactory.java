package com.stefanini.hn.abstractfactory.manager;

import com.stefanini.hn.abstractfactory.abstracts.AbstractFactory;
import com.stefanini.hn.abstractfactory.abstracts.Disco;
import com.stefanini.hn.abstractfactory.abstracts.Memoria;

public class IntelFactory extends AbstractFactory {

	public Disco comprarDisco() {
		
		return new DiscoIntel();
	}

	public Memoria comprarMemoria() {
		
		return new MemoriaIntel();
	}

}