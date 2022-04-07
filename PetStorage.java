package com.demopractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PetStorage {
	
	Set<Pet>petList = new HashSet<Pet>();
	
	
	public void add(Pet pet) {
		petList.add(pet);
	}

	public void remove(Pet pet) {
		petList.remove(pet);
	}
	public Set<Pet> getAnimal1(){
		System.out.println("retuning..");
		return petList;
		
	}
	/*
	public void print(ArrayList varName) {
		
		for(Animal animal : animalList) {
			System.out.println(animal);
		}
	
	}
*/
}
