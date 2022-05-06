package application;

import dao.dao;
import services.sorting;

public class appQuestion1 { //Sorts the Animalist using the Lambda expression from the sorting class then prints the said list.
	
	public static void main(String args[]) {
		
		dao d = new dao();
		sorting s = new sorting();
		
		s.sortWithLambda(d.animalList);
	}

}
