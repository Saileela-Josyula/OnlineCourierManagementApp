package com.cg.datajpa.mts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="memberlogin")
public class OfficeMemberLogin {
	
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	
	public OfficeMemberLogin() {
		
	}

	public OfficeMemberLogin(String username, String password) {
		
		this.username = username;
		this.password = password;
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

	@Override
	public String toString() {
		return "ManagerLogin [username=" + username + ", password=" + password + "]";
	}

	
	
}

