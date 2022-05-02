package com.java.collection.Interface;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionExample1 {
	public static void main(String[] args) {
		Collection<String> girls = new ArrayList<>();
		Collection<String> boys = new ArrayList<>();
		Collection<String> section = new ArrayList<>();

		girls.add("Bhanu");
		girls.add("Sarojini");
		girls.add("Priyanka");
		girls.add("Neelima");
		girls.add("Ratna");
		girls.add("Swathi");
		System.out.println("Names of girlstudents " + girls);

		boys.add("Satvik");
		boys.add("Narendra");
		boys.add("Ayush");
		boys.add("Manohar");
		boys.add("Mahesh");
		System.out.println("Names of boystudents " + boys);

		System.out.println(section.addAll(girls));
		System.out.println(section.addAll(boys));
		System.out.println("Names of students in section " + section);

	}

}
