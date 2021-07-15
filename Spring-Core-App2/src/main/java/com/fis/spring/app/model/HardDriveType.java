package com.fis.spring.app.model;

public class HardDriveType {
	String hardDriveType;

	public HardDriveType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HardDriveType(String hardDriveType) {
		super();
		this.hardDriveType = hardDriveType;
	}
	

	public String getHardDriveType() {
		return hardDriveType;
	}

	public void setHardDriveType(String hardDriveType) {
		this.hardDriveType = hardDriveType;
	}

	@Override
	public String toString() {
		return "HardDriveType " + hardDriveType + "]";
	}
	
	
	
}
