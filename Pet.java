package com.demopractice;

import java.util.Objects;

public abstract class Pet {
	String id;
	enum Color {
		
		BLACK, WHITE, RED;
	}
	String name;
	int prize;
	Color color;
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
	
	
	
	

