package com.fis.spring.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HardDriveType {
	
	@Value("${hardDrive.type}")
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
