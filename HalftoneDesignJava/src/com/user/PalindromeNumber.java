package com.user;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String [] args){
		System.out.println("enter the number you want to check");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int rem,rev=0;
		int temp=a;
		while(a!=0){
			rem=a%10;
			a=a/10;
			rev=rev*10+rem;
			
		}
		if(temp==rev)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
	}
}