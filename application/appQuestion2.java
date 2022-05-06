package application;

import java.util.List;
import java.util.stream.Collectors;

import dao.dao;
import entity.Animal;

public class appQuestion2 { //Creates a stream from the list of objects then maps each Animal toString, sorted in the natural order, and joins everything together into one String
	
	public static void main(String args[]) {
		
		dao d = new dao();
		
		String sortedAnimalList = d.animalList.stream()
											  .map(Animal :: toString)
											  .sorted()
											  .collect(Collectors.joining(","));
		
		System.out.println(sortedAnimalList);
	}

}
