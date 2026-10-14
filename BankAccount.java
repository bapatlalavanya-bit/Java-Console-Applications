package com.myjavaproject;

public class BankAccount {
	int accountnumber;
	String holdername;
	int balance;
	BankAccount(int accountnumber){
		this.accountnumber = accountnumber;
		System.out.println("one arg constructor");
	}
	BankAccount(int accountnumber,String holdername){
		this(accountnumber);
		this.holdername = holdername;
		System.out.println("two args constructor");

	}
	BankAccount(int accountnumber,String holdername,int balance){
		this(accountnumber,holdername);
		this.balance = balance;
		System.out.println("three args constructor");
	}
	void display() {
	System.out.println("person account number:" + accountnumber);
	System.out.println("person holdername :" + holdername);
	System.out.println("person account  balance :" + balance);
	}
	public static void main(String[] args) {
		BankAccount b1 =  new BankAccount(12345,"pavani",2000);
		b1.display();
	}
}
