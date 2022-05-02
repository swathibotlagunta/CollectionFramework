package com.java.collection.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> subjects = new ArrayList<>();
		subjects.add("English");
		subjects.add("Maths");
		subjects.add("Social-2");//index value 2
		subjects.add("Social-1");// Maintains the insertion order
		subjects.add("Hindi");
		//System.out.println(subjects);
		//List.of(subjects);
		//System.out.println(subjects.contains("Biology"));
		//System.out.println("element in index 2 is "+subjects.get(2));//access elements from list
		//System.out.println("element in index 4 is "+subjects.get(3));
		//subjects.forEach((element -> {System.out.println(element);}));//lambda expression
		subjects.add(null);
		subjects.add(null);
		//Collections.sort(subjects);
		//System.out.println(subjects);
		
		
		subjects.forEach((subject ->{System.out.println(subject);}));
		
		

		
		
		
		
		
		
	}

}
