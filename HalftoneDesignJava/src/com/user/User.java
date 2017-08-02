package com.user;

public class User {
	private int id;
	private String name;
	private String location;
	
	
//	User(int id, String name, String location)
//	{
//
//		this.id = id;
//		this.name = name;
//		this.location = location;
//	}
//	
//	User(int id, String name)
//	{
//		this.id = id;
//		this.name = name;
//	}
//	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


}
