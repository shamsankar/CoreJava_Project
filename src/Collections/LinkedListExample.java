package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();

		list1.add("Rohan");
		list1.add("Saran");
		list1.add("Jas");
		list1.add("Shalini");
		System.out.println("The Size of the array is "+ list1.size());
		list1.remove(0); // removing first index String

		System.out.println("The Size of the array is "+ list1.get(0));
		System.out.println(list1);
		
		System.out.println("The Size of the array is "+ list1.size());
		System.out.println(list1);
		
		System.out.println(list1);
		
for (int i =0; i<list1.size(); i++) {
			
			System.out.println(list1.get(i));
	}
		list1.add(2,"Jack");
		
		System.out.println(list1);
		
	}

}
