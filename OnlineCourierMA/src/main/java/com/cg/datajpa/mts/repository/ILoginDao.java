package com.cg.datajpa.mts.repository;

import com.cg.datajpa.mts.entities.ManagerLogin;
import com.cg.datajpa.mts.entities.OfficeMemberLogin;
import com.cg.datajpa.mts.entities.OwnerLogin;
import com.cg.datajpa.mts.exception.UserNotFoundException;

public interface ILoginDao {
	
	public ManagerLogin getManagerInfo(String username)throws UserNotFoundException;
	public OwnerLogin getOwnerInfo(String username)throws UserNotFoundException;
	public OfficeMemberLogin getOfficeMemberInfo(String username)throws UserNotFoundException;

}
