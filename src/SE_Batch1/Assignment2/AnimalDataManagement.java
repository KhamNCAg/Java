package SE_Batch1.Assignment2;

import java.io.*;
import java.util.ArrayList;


public class AnimalDataManagement {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Animal> animals = new ArrayList<>();
        String continueInput;

        try {
            do {
                System.out.print("Enter animal name: ");
                String name = reader.readLine();
                System.out.print("Enter animal age: ");
                int age = Integer.parseInt(reader.readLine());
                System.out.print("Enter animal species: ");
                String species = reader.readLine();

                animals.add(new Animal(name, age, species));

                System.out.print("Do you want to enter another animal? (yes/no): ");
                continueInput = reader.readLine();
                System.out.println();

            } while (!continueInput.equalsIgnoreCase("no"));

            System.out.println("Total number of animals: " + Animal.animalCount);
            System.out.println();
            
            int indx = 1;
            for(Animal animal : animals) {
                animal.displayDetails(indx++);
            }

        } catch (Exception e) {
            System.out.println("Something went wrong, Please try again.");
        }
    }
}

class Animal {
	String name;
	int age;
	String species;
	static int animalCount;
	
	Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
		animalCount++;
	}
	
	void displayDetails(int indx) {
		System.out.println("Animal " + indx + ":");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Species: " + species);
		System.out.println();
	}
}