package com.user;

import java.util.Scanner;

public class Prime {
	public static void main(String [] args){
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		boolean isprime=false;
		for(int i=2;i<a;i++){
			if(a%i==0){
				isprime=true;
				break;
			}
		}
		if(isprime==true){
			System.out.println("number is not prime");
		
		}
		else
			System.out.println("number is prime");
	}
}
