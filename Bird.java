package com.demopractice;

public class Bird extends Pet{

	String species;

	@Override
	public String toString() {
		return "Bird [species=" + species + ", id=" + id + ", name=" + name + ", prize=" + prize + ", color=" + color
				+ "]";
	}
	
	
}
