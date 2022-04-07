package com.demopractice;

public class Lion extends Animal implements Swimmable {
	
	public Lion(String id) {
		
		this.id = id;
		color = Color.RED;
	}
	
	public void eat() {
		
		System.out.println("Lion eats LionFoods");
	}
	@Override
	public void swim() {
		
		System.out.println("Lion can Swim");
		
	}

}
