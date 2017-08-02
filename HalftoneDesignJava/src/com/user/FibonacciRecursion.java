package com.user;

import java.util.Scanner;

public class FibonacciRecursion {
	public static void main(String [] args){
		System.out.println("enter the number upto which you want fibonacci series:");
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		for(int i=0;i<=a;i++){
			System.out.println(fibo(i));
		}
	}
	public  static int fibo(int n){
		if((n==0||n==1)){
			return n;
		}
		else{
			return fibo(n-1)+fibo(n-2);
		}
	}
}
