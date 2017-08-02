package com.user;

public class Main {
public static void main(String[] args) {
		
//		User u = new User(1,"Ram");
		
		User u = new User();
		
		
		
		int id;
		String Uname;
		String Ulocation;
	
		u.setId(1);
		id = u.getId();
		
		u.setName("Binita");
		Uname = u.getName();
		
		u.setLocation("Nepal");
		Ulocation = u.getLocation();
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("Niraj");
		u2.setLocation("Hetauda");
		
	}

}
