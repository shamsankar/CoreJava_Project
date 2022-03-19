package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> set1 = new HashSet<String>(); 
		// Random Order
		
		set1.add("Rick");
		set1.add("Raj");
		set1.add("Mira");
		set1.add("Reena");
		set1.add(null);
		
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		// insertion Order
		set2.add("Rick");
		set2.add("Raj");
		set2.add("Mira");
		set2.add("Reena");
		set2.add(null);
		
		System.out.println(set2);
		
		TreeSet<String> set3 = new TreeSet<String>();
		// Albhabetical order
		
		set3.add("Rick");
		set3.add("Raj");
		set3.add("Mira");
		set3.add("Reena");
		// set3.add(null); we can not add null value to tree set
		
		System.out.println(set3);
		
		String str1 = "Clean World Green World"; // remove dup word//separate the Words//
		
        String [] arr=str1.split(" ");
        HashSet<String >hs=new HashSet<String>();
        for (int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        //hs.add(arr[1]);
        System.out.println("hs"+hs);
	}

}
