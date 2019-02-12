package com.stefanini.hn.abstractfactory.manager;

import com.stefanini.hn.abstractfactory.abstracts.Disco;

/**
 * DiscoIntel.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:46:20 AM 2019
 */
public class DiscoIntel extends Disco {

	/* (non-Javadoc)
	 * @see com.stefanini.hn.abstractfactory.abstracts.Disco#getDisc()
	 */
	public String getDisc() {
		
		return "Ha comprado un disco intel";
	}

}