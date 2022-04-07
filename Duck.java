package com.demopractice;

public class Duck extends Bird implements Swimmable,Flyable {
	
	public Duck(String id) {
		
		this.id = id;
		color = Color.WHITE;
		
	}
	@Override
	public void swim() {
		System.out.println("Duck can Swim");		
	}
	@Override
	public void Fly() {
		System.out.println("Duck can Fly");
		
	}
}
