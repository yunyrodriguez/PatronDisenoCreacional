package com.stefanini.hn.dis.estructural.proxy.manager;

import java.util.ArrayList;

public class SaveData implements ISave{

	public void save(ArrayList saveData) {
		if(ConnectionManager.isConnection()) {
			new ObjectRemote().save(saveData);
		}else {
			new SaveHardDrive().save(saveData);
		}
	}

}
