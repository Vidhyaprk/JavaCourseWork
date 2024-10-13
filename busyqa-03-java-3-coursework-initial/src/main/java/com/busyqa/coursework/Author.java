package com.busyqa.coursework;

public class Author {
	
	private static String firstName;
	private static String lastName;
	public Author (String firstName, String lastName)
	{

	}
	public void setFirstName (String firstName)
	{
		Author.firstName=firstName;
	}
	public void setLastName (String lastName) {
		Author.lastName=lastName;
	}
	public String getFirstName() 
	{
		return firstName;	
	}
	public String getLastName()
	{
		return lastName;
	}

	public String toString()
	{
	
		String name= firstName +" "+ lastName;
		return name;
		
		
	}

	  public static void main(String[] args) 
	  {
		Author myobj = new Author(firstName, lastName);
		myobj.setFirstName("Vidhya");
		myobj.setLastName("Arun Prasad");	
		System.out.println(myobj.toString());
		
	  }
}
	
	
	
	
	

