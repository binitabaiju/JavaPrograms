package com.user;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){
		int a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any value for n");
		int n=s.nextInt();
		int counter=1;
		System.out.println("the required fibonacci series is:");
		while(counter<=n){
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			counter++;
		}
	}
}
