package com.spring.json;

public class User {

	private long id;
	private String userName;
	private String firstName;
	private String password;
	private String email;
	private String sessionId=null;
	private long phone;
	

	  
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public User(long id, String userName, String firstName, String password, String email, String sessionId,
			long phone) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.password = password;
		this.email = email;
		this.sessionId = sessionId;
		this.phone = phone;
	}

	public User(long id, String userName, String firstName, String password, String email, String sessionId) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.password = password;
		this.email = email;
		this.sessionId = sessionId;
	}

	public User(String userName, String firstName, String password) {
		this.userName = userName;
		this.firstName = firstName;;
		this.password = password;
	}

	public User(long id, String userName, String firstName, String password) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;;
		this.password = password;
	}

	public User() {
		
	}
	
	public long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", password=" + password
				+ ", email=" + email + ", sessionId=" + sessionId + ", phone=" + phone + "]";
	}
	
}
