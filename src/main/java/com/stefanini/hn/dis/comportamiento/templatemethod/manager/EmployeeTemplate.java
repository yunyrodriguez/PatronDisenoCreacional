package com.stefanini.hn.dis.comportamiento.templatemethod.manager;

public class EmployeeTemplate extends PersonTemplate{

	private String file;
	
	public EmployeeTemplate(String file) {
		
		setFile(file);
	}

	@Override
	protected String getId() {
		return file;
	}

	@Override
	protected String getTypeId() {
		return "Numero de archivos";
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}
