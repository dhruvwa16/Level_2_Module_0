package intro_to_array_lists;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String>hi = new ArrayList<>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		hi.add("a");
		hi.add("b");
		hi.add("c");
		hi.add("d");
		hi.add("e");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < hi.size(); i++) {
			System.out.println(hi.get(i));
		}
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for(String names: hi ) {
			System.out.println(names);
		}
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < hi.size(); i+=2) {
			System.out.println(hi.get(i));
		}
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >-1; i--) {
			System.out.println(hi.get(i));
		}
		System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < hi.size(); i++) {
			if(hi.get(i).contains("e"))
			System.out.println(hi.get(i));
		}
	}
}
