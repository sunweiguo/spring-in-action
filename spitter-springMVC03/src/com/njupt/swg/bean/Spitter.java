package com.njupt.swg.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

public class Spitter {
	private int id;
	@NotNull
	@Size(min=2,max=10,message="{username.size}")
	private String username;
	@NotNull
	@Size(min=2,max=10,message="{password.size}")
	private String password;
	@NotNull
	@Size(min=2,max=5,message="{firstname.size}")
	private String firstName;
	@NotNull
	@Size(min=2,max=5,message="{lastname.size}")
	private String lastName;
	@NotNull
	@Email(message="{email.valid}")
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Spitter(int id, String username, String password, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Spitter() {
		super();
	}
}
