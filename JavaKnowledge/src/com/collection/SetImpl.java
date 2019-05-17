package com.collection;

import java.util.*;

public class SetImpl {
	public static void main(String[] args) {
		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(1, "Alex");
		HashSet<Student> students = new HashSet<Student>();
		students.add(alex1);
		students.add(alex2);
		System.out.println("HashSet size = " + students.size());
		System.out.println("HashSet size equal override = " + (alex1 == alex2));
		System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex")));
		System.out.println("HashSet contains Alex equal = " + students.contains(alex2));

		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
	}
}
