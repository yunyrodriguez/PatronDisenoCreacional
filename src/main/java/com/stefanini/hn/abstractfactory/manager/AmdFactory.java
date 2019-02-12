package com.stefanini.hn.abstractfactory.manager;

import com.stefanini.hn.abstractfactory.abstracts.AbstractFactory;
import com.stefanini.hn.abstractfactory.abstracts.Disco;
import com.stefanini.hn.abstractfactory.abstracts.Memoria;

public class AmdFactory extends AbstractFactory {
	public Disco comprarDisco() {
		return new DiscoAmd();
	}

	public Memoria comprarMemoria() {
		return new MemoriaAmd();
	}

}