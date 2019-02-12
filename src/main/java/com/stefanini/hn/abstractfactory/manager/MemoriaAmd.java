package com.stefanini.hn.abstractfactory.manager;

import com.stefanini.hn.abstractfactory.abstracts.Memoria;

/**
 * MemoriaAmd.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:53:58 AM 2019
 */
public class MemoriaAmd extends Memoria {

	/* (non-Javadoc)
	 * @see com.stefanini.hn.abstractfactory.abstracts.Memoria#getMemory()
	 */
	public String getMemory() {
		
		return "Ha comprado una memoria Amd";
	}

}
