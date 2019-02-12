package com.stefanini.hn.abstractfactory.manager;

import com.stefanini.hn.abstractfactory.abstracts.AbstractFactory;
import com.stefanini.hn.abstractfactory.abstracts.Disco;
import com.stefanini.hn.abstractfactory.abstracts.Memoria;

/**
 * A factory for creating Intel objects.
 */
public class IntelFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.stefanini.hn.abstractfactory.abstracts.AbstractFactory#buyDisc()
	 */
	@Override
	public Disco buyDisc() {
		return new DiscoIntel();
	}

	/* (non-Javadoc)
	 * @see com.stefanini.hn.abstractfactory.abstracts.AbstractFactory#buyMemory()
	 */
	@Override
	public Memoria buyMemory() {
		return new MemoriaIntel();
	}

}