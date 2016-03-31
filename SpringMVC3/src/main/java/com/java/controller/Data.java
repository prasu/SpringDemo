package com.java.controller;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {
	private String client;
	private String layer;
	private String totalTime;
	
	@XmlAttribute
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	@XmlAttribute
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}
	@XmlAttribute
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

}
