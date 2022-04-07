package com.demopractice;

public class Peacock extends Bird implements Flyable {
	
	public Peacock(String id) {
		
		this.id = id;
		this.color =Color.WHITE;
		
	}
	@Override
	public void Fly() {
		System.out.println("Peacock can fly");
		
	}
}
