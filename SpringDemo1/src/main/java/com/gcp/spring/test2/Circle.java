package com.gcp.spring.test2;

import java.util.List;

public class Circle {
	private List<Diameter> listDiameter;
	private List<Integer> listInt;
	private End endPoint;

	public List<Diameter> getListDiameter() {
		return listDiameter;
	}

	public void setListDiameter(List<Diameter> listDiameter) {
		this.listDiameter = listDiameter;
	}

	public List<Integer> getListInt() {
		return listInt;
	}

	public void setListInt(List<Integer> listInt) {
		this.listInt = listInt;
	}

	public End getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(End endPoint) {
		this.endPoint = endPoint;
	}

}
