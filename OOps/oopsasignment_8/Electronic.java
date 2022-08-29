package com.yash.oopsasignment_8;

public class Electronic {
	private int id;
	private String semiconductorType;
	private String dateOfManufacturing;

	public Electronic(int id, String semiconductorType, String dateOfManufacturing) {
		super();
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	void printinfo() {
		System.out.println("id=" + id + "  semiconductorType=" + semiconductorType + "  dateOfManufacturing="
				+ dateOfManufacturing);
	}

}
