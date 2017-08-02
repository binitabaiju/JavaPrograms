package com.user;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String [] args){
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=a;
		int b,c=0;
		while(a!=0){
			 b=a%10;
			 a=a/10;
			 c=c+(b*b*b);
		}
		if(temp==c)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
	}
	
}
