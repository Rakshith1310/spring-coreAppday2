package com.fis.spring.app.model;

import java.io.Serializable;

import java.util.List;

public class ElectronicDevices implements Serializable {
	
	private HardDriveType hardDriveType;
	private List<Keyboard> keyboard;
	
	private int power;
	private int memory;
	boolean  bluetooth;
	private int ratings;
	
	public ElectronicDevices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicDevices(HardDriveType hardDriveType, List<Keyboard> keyboard, int power, int memory,
			boolean bluetooth, int ratings) {
		super();
		this.hardDriveType = hardDriveType;
		this.keyboard = keyboard;
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

	public List<Keyboard> getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(List<Keyboard> keyboard) {
		this.keyboard = keyboard;
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
		return "ElectronicDevices " + hardDriveType + ", keyboard=" + keyboard + ", power=" + power
				+ ", memory=" + memory + ", bluetooth=" + bluetooth + ", ratings=" + ratings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bluetooth ? 1231 : 1237);
		result = prime * result + ((hardDriveType == null) ? 0 : hardDriveType.hashCode());
		result = prime * result + ((keyboard == null) ? 0 : keyboard.hashCode());
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
		if (keyboard == null) {
			if (other.keyboard != null)
				return false;
		} else if (!keyboard.equals(other.keyboard))
			return false;
		if (memory != other.memory)
			return false;
		if (power != other.power)
			return false;
		if (ratings != other.ratings)
			return false;
		return true;
	}
	
	
	
}//endclass