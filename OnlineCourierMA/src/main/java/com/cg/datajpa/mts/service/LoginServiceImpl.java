package com.cg.datajpa.mts.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.datajpa.mts.entities.ManagerLogin;
import com.cg.datajpa.mts.entities.OfficeMemberLogin;
import com.cg.datajpa.mts.entities.OwnerLogin;
import com.cg.datajpa.mts.exception.UserNotFoundException;
import com.cg.datajpa.mts.repository.LoginDaoImpl;
@Service
public class LoginServiceImpl implements ILoginService{

	@Autowired
	LoginDaoImpl login;
	
	public LoginServiceImpl() {
		super();
		login=new LoginDaoImpl();
	}


	@Override
	public String getManagerPassword(String username,String password) {
		ManagerLogin manager=null;
		try {
			manager=login.getManagerInfo(username);
		}
		catch(UserNotFoundException ex) {
			
		}
		if(manager!=null) {
			if(manager.getPassword().equals(password))
				return "valid";
		}
		return "invalid";
	}

	@Override
	public String getMemberPassword(String username,String password) {
		OfficeMemberLogin member=null;
		try {
			member=login.getOfficeMemberInfo(username);
		}
		catch(UserNotFoundException ex) {
			
		}
		if(member!=null) {
			if(member.getPassword().equals(password))
				return "valid";
		}
		return "invalid";
	}

	@Override
	public String getOwnerPassword(String username,String password) {
		OwnerLogin owner=null;
		try {
			owner=login.getOwnerInfo(username);
		}
		catch(UserNotFoundException ex) {
			
		}
		if(owner!=null) {
			if(owner.getPassword().equals(password))
				return "valid";
		}
		return "invalid";
	}
}