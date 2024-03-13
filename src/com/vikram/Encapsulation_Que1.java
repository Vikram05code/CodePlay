/*Create a Java class BankAccount with private fields such as balance, accountNumber, and owner. Implement public methods to deposit, withdraw, and check balance. 
  Ensure that the balance cannot be accessed directly from outside the class.
 */

package com.vikram;


class BankAccount {
	
	private double balance;
	private Long accountNumber;
	private String accountHolderName;
	
	public BankAccount(Long accountNumber, String accountHolderName) {
		
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=0.0;
		
	}
	
	public double deposit( double amount) {
		
		if(amount>0) {
			balance+=amount;
			System.out.println("Cash deposit successful");
			System.out.println("deposit amount : "+ amount);
			System.out.println("Current Balance : "+balance);
		}
		else {
			System.out.println("Invalid deposit");
		}
		
		return balance;
	}
	
	public double withdraw(double amount) {
		
		if(amount<=balance) {
			balance-=amount;
			System.out.println("Cash withdraw successful");
			System.out.println("withdrawal amount : "+ amount);
			System.out.println("Current Balance : "+balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
		return balance;
	}
	
	public double checkBalance() {
		return balance;
	}
	
	
}



public class Encapsulation_Que1 {
  
	 public static void main(String[] args) {
		 
		 BankAccount account1 = new BankAccount(12345678L, "Vikram");
		 account1.deposit(200000);
		 account1.withdraw(10000);
		 account1.checkBalance();
		 
	 }
}
