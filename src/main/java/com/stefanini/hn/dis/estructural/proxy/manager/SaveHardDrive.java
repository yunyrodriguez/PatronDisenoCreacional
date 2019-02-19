package com.stefanini.hn.dis.estructural.proxy.manager;

import java.util.ArrayList;

public class SaveHardDrive implements ISave{

	public void save(ArrayList saveData) {
		System.out.println("Guardando datos en el Disco");
	}

}
