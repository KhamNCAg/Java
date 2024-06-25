package Day6;

public class Animal {
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

class Dog extends Animal {
	 @Override
	 public void makeSound() {
	     System.out.println("Bark");
	 }
	 
	 public static void main(String[] args) {
	     Animal myDog = new Dog();
	     myDog.makeSound(); // Bark
	 }
}