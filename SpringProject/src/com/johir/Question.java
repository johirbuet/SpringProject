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
	private Map<Answer,User> answers;
	public Question(int id,String name,Map<Answer,User> answers) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	public void displayInfo(){
		System.out.println(" "+id+"  "+name);
		System.out.println("Answers are:");
		Set<Entry<Answer, User>> set=answers.entrySet();
		Iterator<Entry<Answer,User>> iter=set.iterator();
		while(iter.hasNext()){
			Entry<Answer,User> entry= iter.next();
			Answer ans=entry.getKey();
			User user=entry.getValue();
			System.out.println("Answer Info:");
			System.out.println(ans);
			System.out.println("User Info");
			System.out.println(user);
		}
	}

}
