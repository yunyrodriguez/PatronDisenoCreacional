package com.stefanini.hn.abstractfactory.manager;

/**
 * A factory for creating Abstract objects.
 */
public abstract class AbstractFactory {
	
	/**
	 * Buy disc.
	 *
	 * @return the disco
	 */
	public abstract Disco buyDisc();
	
	/**
	 * Buy memory.
	 *
	 * @return the memoria
	 */
	public abstract Memoria buyMemory();
}
