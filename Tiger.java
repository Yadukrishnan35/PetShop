package com.demopractice;

public class Tiger extends Animal implements Swimmable {

	public Tiger(String id) {
		this.id = id;
		color = Color.WHITE;
	}
	
	public void eat() {
		
		System.out.println("Tiger eats chicken");
	}
	@Override
	public void swim() {
		System.out.println("Tiger can Swim");
	}
}
