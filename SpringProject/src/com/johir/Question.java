package com.johir;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	//private List<Answer> answers;
	private Map<String,String> answers;
	public Question(int id,String name,Map<String,String> answers) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	public void displayInfo(){
		System.out.println(" "+id+"  "+name);
		System.out.println("Answers are:");
		Set<Entry<String, String>> set=answers.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext()){
			Entry<String,String> entry=(Entry<String, String>) iter.next();
			System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
		}
	}

}
