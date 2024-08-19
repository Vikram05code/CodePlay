
/*Java Program to Get the Maximum Element From a Vector
 
 */

package com.vikram;

import java.util.Iterator;
import java.util.Vector;

public class MaxElementInVector  {
	
	public static void main(String[] args)  {
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(15);
		vector.add(5);
		vector.add(8);
		vector.add(22);
		vector.add(25);
		
		int maxValue=Integer.MIN_VALUE;
		
		Iterator iterator = vector.iterator();
		
		while(iterator.hasNext()) {
			int element = (int) iterator.next();
			if(element>maxValue) {
				maxValue=element;
			}
		}
		
		System.out.println("The largest element in the given Vector is "+maxValue);
		
	}

}
