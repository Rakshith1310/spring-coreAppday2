package com.fis.spring.app.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ElectronicDevices implements Serializable,Comparable<ElectronicDevices> {
	
	@Autowired
	private HardDriveType hardDriveType;
	
	@Value("${dev.power}")
	private int power;
	
	@Value("${dev.memory}")
	private int memory;
	
	@Value("${dev.bluetooth}")
	boolean  bluetooth;
	
	@Value("${dev.ratings}")
	private int ratings;
	
	public ElectronicDevices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicDevices(HardDriveType hardDriveType, int power, int memory,
			boolean bluetooth, int ratings) {
		super();
		this.hardDriveType = hardDriveType;
		this.power = power;
		this.memory = memory;
		this.bluetooth = bluetooth;
		this.ratings = ratings;
	}

	public HardDriveType getHardDriveType() {
		return hardDriveType;
	}

	public void setHardDriveType(HardDriveType hardDriveType) {
		this.hardDriveType = hardDriveType;
	}

	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "ElectronicDevices " + hardDriveType + ", power=" + power
				+ ", memory=" + memory + ", bluetooth=" + bluetooth + ", ratings=" + ratings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bluetooth ? 1231 : 1237);
		result = prime * result + ((hardDriveType == null) ? 0 : hardDriveType.hashCode());
		result = prime * result + memory;
		result = prime * result + power;
		result = prime * result + ratings;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDevices other = (ElectronicDevices) obj;
		if (bluetooth != other.bluetooth)
			return false;
		if (hardDriveType == null) {
			if (other.hardDriveType != null)
				return false;
		} else if (!hardDriveType.equals(other.hardDriveType))
			return false;
		if (memory != other.memory)
			return false;
		if (power != other.power)
			return false;
		if (ratings != other.ratings)
			return false;
		return true;
	}

	public int compareTo(ElectronicDevices o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}//endclass