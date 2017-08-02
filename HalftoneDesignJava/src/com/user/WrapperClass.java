package com.user;

public class WrapperClass {
	public static void main(String [] args){
		int i=5;
		System.out.println("the value of i is:"+i);
		Integer a=new Integer(i);//boxing
		System.out.println(a);
		Integer b=i;//auto boxing
		
		int c=a.intValue();//unboxing
		System.out.println(c);
		int d=a;//autounboxing
		System.out.println(d);
		
		
		
	}
}
