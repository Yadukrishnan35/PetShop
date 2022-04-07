package com.demopractice;

public class Parrot extends Bird implements Flyable{
	
	public Parrot(String id) {
		
		this.id = id;
		this.color = Color.RED;
	
	}
	@Override
	public void Fly() {
		System.out.println("Parrot can fly");
	
	}
}
