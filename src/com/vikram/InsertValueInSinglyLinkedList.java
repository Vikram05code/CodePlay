package com.vikram;


public class InsertValueInSinglyLinkedList {

       ListNode head;
	
	  class ListNode{
		
	  int data;
	 
	  ListNode next;
	 
	 public ListNode(int data) {
		 this.data=data;
		 this.next=null;
	 }
		
	}
	  
	  public void  insertFirst(int value) {
			
			ListNode newNode = new ListNode(value);
			newNode.next = head;
			head=newNode;
		}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		InsertValueInSinglyLinkedList linkedList = new InsertValueInSinglyLinkedList();
		linkedList. insertFirst(12);
		linkedList.insertFirst(20);
		linkedList.insertFirst(5);
		linkedList.insertFirst(7);
		
		linkedList.display();
	
	
	
}
	
}
