package VU;

import java.util.*;

public class HashDemo {

	/**
	 * Hashmap store data aganist key 
	 */
	public static void main(String[] args) {

		HashMap h = new HashMap();

		student s1 = new student("ali", 12);
		student s2 = new student("ahmad", 14);

		h.put("one", s1); // key must be an object can't use premitive type

		boolean b = h.isEmpty();
		if (b == true) {
			System.out.println("The hashmap is empty");
		} else {
			student s = (student) h.get("one"); // down casting need to be done
												// explicitly
			s.print();

		}
	}

}

class student {
	String name;
	int number;

	public student(String name, int number) {
		this.number = number;
		this.name = name;
	}

	public void print() {
		System.out.println("Name is "+name+" number: "+number);
	}

}
