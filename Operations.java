package com.demopractice;

import java.util.Set;

public class Operations {
	
	public void selectOperation(int choice) {
		UserInterface userInterface = new UserInterface();
		PetStorage petStorage = new PetStorage();
		
		Main  main = new Main();
		
		switch(choice) {
		case 1 	: 	main.add();
		 			
						break;
		case 2: main.displayData();
				break;
					
		//case 2 	:    //Set<Pet> petList = petStorage.getAnimal1();
					 // System.out.println(petList);     
					//break;
		default: System.out.println("please enter");
		
		}
	}
}
