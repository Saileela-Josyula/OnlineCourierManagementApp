package com.cg.datajpa.mts.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.datajpa.mts.entities.ManagerLogin;
import com.cg.datajpa.mts.entities.OfficeMemberLogin;
import com.cg.datajpa.mts.entities.OwnerLogin;
import com.cg.datajpa.mts.exception.UserNotFoundException;
@Repository
public class LoginDaoImpl implements ILoginDao{

	@Autowired
	EntityManager em;
	
	public LoginDaoImpl() {
		em=JpaUtils.getEntityManager();
	}
	
	
	@Override
	public ManagerLogin getManagerInfo(String username) throws UserNotFoundException {
		ManagerLogin ml=em.find(ManagerLogin.class, username);
		return ml;
	}

	@Override
	public OwnerLogin getOwnerInfo(String username) throws UserNotFoundException {
		OwnerLogin ol=em.find(OwnerLogin.class, username);
		return ol;
	}

	@Override
	public OfficeMemberLogin getOfficeMemberInfo(String username) throws UserNotFoundException {
		OfficeMemberLogin oml=em.find( OfficeMemberLogin.class, username);
		return oml;
	}

}
