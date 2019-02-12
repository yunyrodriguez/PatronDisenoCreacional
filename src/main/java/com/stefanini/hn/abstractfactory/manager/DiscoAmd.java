package com.stefanini.hn.abstractfactory.manager;

import com.stefanini.hn.abstractfactory.abstracts.Disco;

/**
 * DiscoAmd.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:52:33 AM 2019
 */
public class DiscoAmd extends Disco {

	/* (non-Javadoc)
	 * @see com.stefanini.hn.abstractfactory.abstracts.Disco#getDisc()
	 */
	public String getDisc() {
		return "Ha comprado un Disco AMD";
	}

}