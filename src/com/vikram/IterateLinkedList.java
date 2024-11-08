package com.vikram;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> numberLinkedList = new LinkedList<>();
		numberLinkedList.add(12);
		numberLinkedList.add(16);
		numberLinkedList.add(27);
		numberLinkedList.add(50);
		numberLinkedList.add(45);
		numberLinkedList.add(87);

		Iterator<Integer> iterator = numberLinkedList.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

}