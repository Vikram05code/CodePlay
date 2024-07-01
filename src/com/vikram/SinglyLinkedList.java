package com.vikram;

import java.awt.HeadlessException;

public class SinglyLinkedList {

	private ListNode head;
	
	private static class ListNode{
		
	 private int data;
	 
	 private ListNode next;
	 
	 public ListNode(int data) {
		 this.data=data;
		 this.next=null;
	 }
		
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.head=new ListNode(12);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(2);
		
		//now connect node to each other
		
	singlyLinkedList.head.next=second;  //12-->10
	second.next=third;     //12-->10-->5
	third.next=fourth;     //12-->10-->5-->2
	fourth.next=null;      //12-->10-->5-->2-->null;	
	}
	
}
