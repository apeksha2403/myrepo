package com.Collection;
import java.util.*;
import java.lang.*;

class User{
	private String name;
	private String loginName;
	private String password;
	public User(String name, String loginName, String password) {
		super();
		this.name = name;
		this.loginName = loginName;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", loginName=" + loginName + ", password=" + password + "]";
	}
}

public class ChatApplication {
	private static Map<String,TreeSet<User>> hmapUser=new HashMap<String,TreeSet<User>>();
	private static Map<String,List<String>> hmapMsg=new  HashMap<String,List<String>>();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Welcome to Chatroom=====>");
		System.out.println("Enter your Option: ");
		int option[]= {1,2,3,4,5,6,7,8,9};
		int o=sc.nextInt();
		switch(o) {
		case 1: 
			System.out.println("Create a Chatroom====>");
			String chatRoomName=sc.next();
			if(true) {
	        	if(hmapUser.containsKey(chatRoomName)) {
	        		//chat room already exists
	        		System.out.println("ChatRoom already Created....!!!1");
	        	}
	        	else {
	        		hmapUser.put(chatRoomName, new TreeSet<User>());
	        		hmapMsg.put(chatRoomName, new ArrayList<String>());
	        		System.out.println("ChatRoom Created....!!!");
	        	}
	        }
		
		         break;
		case  2:
			System.out.println("Add the user====>");
			
			 break;
		case  3:
			System.out.println("User login====>");
			 break;
		case  4:
			System.out.println("Send a message====>");
			 break;
		case 5:
			System.out.println("Display the messages from a specific chatroom====>");
			 break;
		case  6:
			System.out.println("List down all users belonging to the specified chat room.====>");
			 break;
		case  7:
			System.out.println(" Logout====>");
			 break;
		case  8:
			  System.out.println("Delete an user====>");
			  break;
		case  9:
			  System.out.println("Delete the chat room====>");
			  break;
			  
	    default: 
				 System.out.println("INVALID OPTION  !!!!!!");
				 break;
		}
		
      
	}

}
