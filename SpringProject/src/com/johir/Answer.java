package com.johir;

import java.util.Date;

public class Answer {
	int id;
	String answer;
	Date postedDate;
	public Answer(int id,String answer,Date postedDate) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.answer=answer;
		this.postedDate=postedDate;
	}
	public String toString(){
		return "ID: "+id+" Answer: "+answer+"Posted On:  "+postedDate;
	}

}
