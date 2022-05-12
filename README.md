# PromineoTechWeek11CodingAssignment

# Coded by Thomas Le

## Synopsis:
The goal of this assignment is to utilize lamda expressions, streams, and optionals.

## Details of the packages:

### application
- appQuestion1.java
	Class with main to execute the method, sortWithLambda.
- appQuestion2.java
	Class with main which uses stream plus map, sorted, and collect then prints out the resulting sorted list
	of animals in all in the same line separated by comma.
- appQuestion3.java
	Class with main with a run method which takes in an optional parameter of type Animal. The optionals, nullTest
	and animalTest are used to test the resulting expressions depending on whether or not the optional is null.

### dao
- dao.java
	Creates a new list of animal, has the compareName method and a method to handle an optional called
	animalExists.

### entity
- Animal.java
	Identified the Animal object along with its getters and setters. Also has an override toString() method
	that returns "This is the " + name + " animal"; instead of just the animal name.

### services
- sorting.java
	Has the method, sortWithLambda which takes in a parameter, animalList then sorts them by the
	compareName function and subsequently prints out the resulting list.
