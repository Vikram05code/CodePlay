package com.vikram.linkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList1 linkedList1 = new LinkedList1();
		linkedList1.insertFirst(12);
		linkedList1.insertFirst(8);
		linkedList1.insertFirst(16);
		linkedList1.insertFirst(15);
		linkedList1.insertFirst(4);
		linkedList1.insertFirst(20);
		linkedList1.insertLast(80);
		linkedList1.insert(50,3);
		linkedList1.display();
		System.out.println();
		System.out.println("Removed Node value : "+linkedList1.deleteFirst());
		linkedList1.display();
		System.out.println();
		System.out.println("Deleted Last Node :"+linkedList1.deleteLast());
		linkedList1.display();
		System.out.println();
		System.out.println("Deleted Node at given index :"+linkedList1.deleteAtIndex(2));
		linkedList1.display();
	}

}
