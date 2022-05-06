package application;

import java.util.NoSuchElementException;
import java.util.Optional;

import dao.dao;
import entity.Animal;

public class appQuestion3 { //Methods using Optionals
	
	private static dao d = new dao();
	
	public static void main(String[] args) { //Optional nullTest to see the error statement if optional is null. Optional animalTest to see the output for an optional that exists.
		Animal test = new Animal("Oyster" , "Yap" , 1);
		Optional<Animal> nullTest = Optional.ofNullable(null);
		Optional<Animal> animalTest = Optional.ofNullable(test);
		run(animalTest);
		run(nullTest);		
	}
	
	public static void run(Optional<Animal> optionalAnimal) { //Second method  calls method a and also calls method a with an empty optional which will throw an error if needed.
		try {
		optionalAnimal.orElseThrow(() -> new NoSuchElementException(
				"The object " + optionalAnimal + " is missing!"));
		System.out.println(d.animalExists(optionalAnimal));
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}

}
