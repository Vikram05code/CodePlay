/*Write a Java program to demonstrate basic operations on ArrayList such as adding
  elements, removing elements, updating elements, and iterating through the list.
 */


package vikram;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ques1 {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Rohan");
		arrayList.add("Shashi");
		arrayList.add("Rohit");
		arrayList.add("Vishnu");
		arrayList.add("Rohit");
		
		System.out.println("ArrayList: "+arrayList);
		
		arrayList.remove("Rohan");
		System.out.println(arrayList);
		
	}
	
}
