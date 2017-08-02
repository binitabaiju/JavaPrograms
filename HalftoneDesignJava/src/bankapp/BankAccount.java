package bankapp;

import java.util.Scanner;

public class BankAccount {
	double balance;
	double previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid){
		customerName=cname;
		customerId=cid;
	}
	
	public void deposit(int amount){
		if(amount!=0){
			balance=balance+amount;
			previousTransaction=-amount;
		}
	}
	public void withdraw(int amount){
		if(amount!=0){
			balance=balance-amount;
			previousTransaction=amount;
		}
	}
	public void getPreviousTransaction(){
		if(previousTransaction>0){
			System.out.println("amount deposited= "+previousTransaction);
		}
		else if(previousTransaction<0){
			System.out.println("amount withdrawn= "+Math.abs(previousTransaction));
		}
		else
			System.out.println("no transaction performed");
	}
	public void showMenu(){
		char option='\0';
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("Your id is "+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		System.out.println("\n");
		
		do{
		System.out.println("*******************");	
		System.out.println("Enter an option");
		System.out.println("*******************");
		option=s.next().charAt(0);
		System.out.println("\n");
		
		switch(option){
		case 'A':
			System.out.println("--------------------");
			System.out.println("Balance= "+balance);
			System.out.println("--------------------");
			System.out.println("\n");
			break;
		case 'B':
			System.out.println("--------------------------");
			System.out.println("Enter the amount to deposit");
			System.out.println("--------------------------");
			int amt=s.nextInt();
			deposit(amt);
			System.out.println("\n");
			break;
		case 'C':
			System.out.println("--------------------------");
			System.out.println("Enter the amount to withdraw");
			System.out.println("--------------------------");
			int amt1=s.nextInt();
			withdraw(amt1);
			System.out.println("\n");
			break;
		case 'D':
			System.out.println("--------------------------");
			getPreviousTransaction();
			System.out.println("--------------------------");
			System.out.println("\n");
			break;
		case 'E':
			System.out.println("--------------------------");
			System.out.println("\n");
		default:
			System.out.println("Opps!!! Invalid option... please try again");
			break;
		}	
		}while(option!='E');
		
		System.out.println("Thank you for using our services....  Vist Again!!!");
			
	}
		
	
}
