package services;

import java.util.List;

import dao.dao;
import entity.Animal;

public class sorting {
	
	public dao d = new dao();
	
	public void sortWithLambda(List<Animal> animalList) {
		animalList.sort((Animal a, Animal b) -> d.compareName(a, b));
		animalList.forEach(System.out::println);
	}
}
