package com.java.collection.Interface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {

	public static void main(String[] args) {
		Collection<String> studentcollection = new ArrayList<>();
		
		studentcollection.add("Bhanu");//index=0
		studentcollection.add("Swathi");
		studentcollection.add("priyanka");
		studentcollection.add("sarojini");
		System.out.println(studentcollection);
		studentcollection.remove("Swathi");
		System.out.println(studentcollection);
		//studentcollection.clear();
		System.out.println(studentcollection);
		System.out.println(studentcollection.contains("priyanka"));
		studentcollection.forEach((element) ->{System.out.println(element);});//lambda expression
		
		
		
	}	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*// adding elements
		studentcollection.add("Sita");
		studentcollection.add("Raghu");
		studentcollection.add("Ramu");
		studentcollection.add("laxman");
		studentcollection.add("geetha");
		studentcollection.add("geetha");//Allows to add duplicate elements
		System.out.println(studentcollection);
		// removing elements
		studentcollection.remove("Raghu");
		//printing all elements
		studentcollection.forEach((element) ->{System.out.println(element);});//lambda expression
		
		System.out.println(studentcollection);
		// checking for elements
		System.out.println(studentcollection.contains("Ramu"));
		// removing all elements
		// studentcollection.clear
		studentcollection.removeAll(studentcollection);
		System.out.println(studentcollection);

	}

}*/
