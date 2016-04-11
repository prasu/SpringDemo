package com.gcp.source.lesson16;

public class Demo {
	private String name;
	private String msg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toString(){
		return(name +" "+msg);
	}

}
