package com.demopractice;

import java.util.HashSet;
import java.util.Set;

public class Main {
	PetStorage petStorage = new PetStorage();
	UserInterface userInterface = new UserInterface();
	Set<Pet> petList;
	public void add() {
		//UserInterface userInterface = new UserInterface();
		
		Animal tiger = new Tiger("T001");
		tiger.name = "tiger1";
		tiger.prize= 1000;
		tiger.breed = "Tiguzz";
		
		Animal tiger1 = new Tiger("T001");
		tiger1.name = "tiger1";
		tiger1.prize= 1000;
		tiger1.breed = "Tiguzz";
		
		Animal lion = new Lion("L001");
		lion.name = "Lion1";
		lion.prize = 2000;
		lion.breed = "Linoos";
		
		Animal hippo = new Hippo("H001");
		hippo.name ="hippo1";
		hippo.prize = 3000;
		hippo.breed = "Hippoos";
		
		Bird duck = new Duck("D001");
		duck.name = "Duck1";
		duck.prize = 1000;
	    duck.species = "duckoos";
		
	    Bird peacock = new Peacock("p001");
		peacock.name = "peackock1";
		peacock.prize = 299;
		peacock.species = "peackoos";
	    
		
	    Bird parrot = new Parrot("P001");
	    parrot.name = "parrot";
	    parrot.prize = 1000;
	    parrot.species ="parratoo";
		
	    
	    petStorage.add(tiger);
		petStorage.add(tiger1);
	    petStorage.add(hippo);
		petStorage.add(lion);
		petStorage.add(duck);
		petStorage.add(parrot);
		petStorage.add(peacock);
		
		System.out.println(petStorage.getAnimal1());
		//userInterface.print(petStorage.getAnimal1());
		System.out.println("Inside Add method");
	}
	public void displayData() {
		//PetStorage petStorage = new PetStorage();
		userInterface.print(petStorage.getAnimal1());
		//System.out.println("petlist is "+petList);
	}
	
	public static void main(String[] args) {
		
		UserInterface userInterface = new UserInterface();
		Operations operations = new Operations();
		PetStorage petStorage = new PetStorage();
		
		int choice = 0;
		while(choice !=2) {
			
			choice = userInterface.showMainMenu();
			operations.selectOperation(choice);
		}
		
		
		
		
		/*
		PetStorage petStorage = new PetStorage();
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(petStorage.getAnimal1());
		
		
		//System.out.println(animalStorage);
		//animalStorage.print(animalStorage.getAnimal1());
		
		//petStorage.remove(hippo);
		//System.out.println("Hippo has been removed");
		//userInterface.print(petStorage.getAnimal1());
		
	    System.out.println("Printing animals only");
		userInterface.printAnimals(petStorage.getAnimal1());
		
		System.out.println("Printing Birds Only");
		userInterface.printBirds(petStorage.getAnimal1());
		
		System.out.println("Printing Swimmable pets");
		userInterface.printSwimmable(petStorage.getAnimal1());
		
		System.out.println("Printing Flyable Pets");
		userInterface.printFlyable(petStorage.getAnimal1());
		
		//animalStorage.print(animalStorage.getAnimal1());
		
		userInterface.showMainMenu();
		
		//animalStorage.getAnimal1();
		//System.out.println(animalStorage.getAnimal1());
		//ArrayList animalList1 = animalStorage.getAnimalList();
		//System.out.println(animalList1);
		
		//animalStorage.print();
		
		///animalStorage.print(animalList);
		
		//ArrayList animalListww = animalStorage.getAnimalList();  
		//animalStorage.print();
		
		//animalList.add(tiger);
		//animalList.add(lion);
		//animalList.add(hippo);
		/*
		for(Animal animaltest : animalList) {
			System.out.println(animaltest);
		

	}
*/
	}
}
