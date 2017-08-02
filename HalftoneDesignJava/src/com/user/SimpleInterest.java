package com.user;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		double P,T,R,SI,CI;
		System.out.println("enter required principal");
		P=s.nextDouble();
		System.out.println("enter required time");
		T=s.nextDouble();
		System.out.println("enter required rate");
		R=s.nextDouble();
		SI=(P*T*R)/100;
		System.out.println("simple interest is:"+SI);
		System.out.println("enter value of n");
		int n=s.nextInt();
		CI=P*Math.pow(1+(R/n),n* T);
		System.out.println("compound interest is:"+CI);
	}
}
