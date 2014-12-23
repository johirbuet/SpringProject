package com.johir;

public class Answer {
	int id;
	String name;
	String by;
	public Answer(int id,String name,String by) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.by=by;
	}
	public String toString(){
		return id+" "+name+" "+by;
	}

}
