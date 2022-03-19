package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arraylist1 = new 	ArrayList<String>();
		
		arraylist1.add("Raj"); // 0 index
		arraylist1.add("Priya"); // 1 index
		arraylist1.add("Reena"); // 2 index
		arraylist1.add("Rohan"); // 3 index
		
		System.out.println("The Size of the array is "+ arraylist1.size());
		arraylist1.remove(0); // removing first index String

		System.out.println("The Size of the array is "+ arraylist1.get(0));
		System.out.println(arraylist1);
		
		System.out.println("The Size of the array is "+ arraylist1.size());
		System.out.println(arraylist1);
		
		arraylist1.set(1, "Supriya"); // to replace the Value at the first position
		

		for (int i =0; i<arraylist1.size(); i++) {
			
			System.out.println(arraylist1.get(i));
			
		}
		for(String name:arraylist1) {
			
			System.out.println(name);
			
		}
		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Sorting an arraylist
		
				Collections.sort(arraylist1);
				System.out.println(arraylist1);
		
		
	}

}
