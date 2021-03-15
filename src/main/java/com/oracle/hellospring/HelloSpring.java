package com.oracle.hellospring;

public class HelloSpring {
	
	//属性 
	private String who; 
	
	public String getWho() { 
		return who; 
	}
	
	public void setWho(String who) { 
		this.who = who; 
	}
	
	/**
	 * 显示方法 
	 */ 
	public void print() { 
		
		System.out.println("hello,"+this.getWho()); 
		}

}
