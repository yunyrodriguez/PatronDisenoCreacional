package com.stefanini.hn.dis.estructural.proxy.manager;

import java.util.ArrayList;

public class ObjectRemote implements ISave {

	public void save(ArrayList saveData) {
		System.out.println("Guardando en el objeto remoto");
	}

}