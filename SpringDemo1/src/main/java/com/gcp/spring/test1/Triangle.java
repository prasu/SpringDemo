package com.gcp.spring.test1;


public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public void draw(){
		System.out.println(pointA.toString());
		System.out.println(pointB.toString());
		System.out.println(pointC.toString());
	}


	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

}
