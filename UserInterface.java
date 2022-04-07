package com.demopractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

	public void print(Set<Pet> petList) {
		
		for(Pet animal : petList) {
			
			System.out.println(animal);
		}
		
	}

	public void printAnimals(Set<Pet> animalList) {
		
		for(Pet o : animalList) {
			if(o instanceof Animal) {
				System.out.println(o);
			}
		}
		
	}

	public void printBirds(Set<Pet> birdsList) {
		
		for(Pet o : birdsList) {
			
			if(o instanceof Bird) {
				System.out.println(o);
			}
		}
		
	}
	public void printSwimmable(Set<Pet> petList) {
		
		for(Pet pet : petList) {
			
			if(pet instanceof Swimmable) {
				
				Swimmable swimmable = (Swimmable)pet;
				swimmable.swim();
			}
		}
	}
	public void printFlyable(Set<Pet>petList) {
		
		for(Pet pet : petList) {
			if(pet instanceof Flyable) {
				Flyable flyable = (Flyable)pet;
				flyable.Fly();
			}
	
		}
	}
	public int showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select");
		System.out.println("1.Add Pet \n2.Remove Pet \n3.Update Pet \n4.Print Pet \n5.Exit");
		int choice = sc.nextInt();
		return choice;
	}


}
