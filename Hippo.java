package com.demopractice;

public class Hippo extends Animal implements Swimmable {
	public Hippo(String id) {
	
		this.id = id;
		color = Color.BLACK;

	}
	public void eat() {
		
		System.out.println("Hippo eats hippofood ");
	}

	@Override
 	public void swim() {
		System.out.println("Hippo can Swim");
	
	}
}
