package com.johir;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answer> answers;
	public Question(int id,String name,List<Answer>answers) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	public void displayInfo(){
		System.out.println(" "+id+"  "+name);
		System.out.println("Answers are:");
		Iterator<Answer> iter=answers.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
