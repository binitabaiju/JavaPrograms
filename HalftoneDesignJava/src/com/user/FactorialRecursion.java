package com.user;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String [] args){
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=facto(a);
		System.out.println("the factorial of "+a+ " "+ "is"+" "+b);
		
	}
	public static int facto(int n){
		if(n==1){
			return 1;
		}
		else{
			return facto(n-1)*n;
		}
	}

}
