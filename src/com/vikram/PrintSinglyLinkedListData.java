package com.vikram;


public class PrintSinglyLinkedListData {

     private ListNode head;
	
	private static class ListNode{
		
	 private int data;
	 
	 private ListNode next;
	 
	 public ListNode(int data) {
		 this.data=data;
		 this.next=null;
	 }
		
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
		
		PrintSinglyLinkedListData printSinglyLinkedListData = new PrintSinglyLinkedListData();
		printSinglyLinkedListData.head=new ListNode(12);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(2);
		
		//now connect node to each other
		
	printSinglyLinkedListData.head.next=second;  //12-->10
	second.next=third;     //12-->10-->5
	third.next=fourth;     //12-->10-->5-->2
	fourth.next=null;      //12-->10-->5-->2-->null;	
	
	printSinglyLinkedListData.display();
	
	}
	
	
	
	
}
