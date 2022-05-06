package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import entity.Animal;

public class dao {
	
	public List<Animal> animalList = new ArrayList <Animal> (List.of(
			new Animal ("Dog", "Woof", 4),
			new Animal ("Cat", "Meow", 4),
			new Animal ("Kangaroo", "Yip", 2),
			new Animal ("Snake", "Hiss", 0)));

	public static int compareName(Animal a, Animal b) {
		return a.getName().compareTo(b.getName());
	}
	
	public Animal animalExists(Optional<Animal> optionalAnimal) { //First method takes in an Optional of Animal called optionalAnimal then returns the Animal object if it exists
		if (optionalAnimal.isPresent()) {
			return optionalAnimal.get();
		} else {
			throw new NoSuchElementException("There is not an object in the optionalAnimal Optional"); //throws a NoSuchElementException if the Animal object does not exist.
		}
	}
}


