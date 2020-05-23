package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private int age;
	private String password;
	
	public User() {
		
	}
	
	public User(int id,String firstname, String lastname, String username, int age, String password) {
		super();
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.age = age;
		this.password = password;
	}
	
	@javax.persistence.Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
