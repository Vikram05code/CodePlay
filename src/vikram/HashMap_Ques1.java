/*Implement a Java program to perform operations on HashMap like adding key-value pairs, 
 removing elements, updating values, and iterating through the map.
 */

package vikram;

import java.util.HashMap;
import java.util.Map;


public class HashMap_Ques1 {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		//Adding key-value pair
		hashMap.put("Vikram",25);
		hashMap.put("Rahul", 29);
		hashMap.put("Rohit", 30);
		hashMap.put("Abhishek", 27);
		hashMap.put("Monu", 27);
		
		//displaying the hashMap
		System.out.println("HashMap : "+ hashMap);
		System.out.println("-----------------------------------------------------------------------");
		//removing an element
		hashMap.remove("Monu");
		
		hashMap.put("Vikram", 26);
		System.out.println("After updating Vikram's age: "+hashMap);
		System.out.println("-----------------------------------------------------------------------");
		//Iterating through the HashMap
		System.out.println("Iterating through the HashMap: ");
		System.out.println("-----------------------------------------------------------------------");
		for(Map.Entry<String, Integer>entry : hashMap.entrySet()) {
			System.out.println("Key: "+entry.getKey() + ", Value: "+entry.getValue());
		}
		
	}
	
}
