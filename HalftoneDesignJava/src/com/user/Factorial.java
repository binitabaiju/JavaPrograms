package com.user;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		System.out.println("enter the required number:");
		Scanner a=new Scanner (System.in);
		int b =a.nextInt();
		int c=1;
		for(int i=1;i<=b;i++){
			c=c*i;
		}
		System.out.println("the factorial of " +b+ " "+ "is"+" " +c);
	}
}
