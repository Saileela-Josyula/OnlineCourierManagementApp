package com.cg.datajpa.mts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.datajpa.mts.entities.ManagerLogin;
import com.cg.datajpa.mts.entities.OfficeMemberLogin;
import com.cg.datajpa.mts.entities.OwnerLogin;
import com.cg.datajpa.mts.repository.LoginDaoImpl;
import com.cg.datajpa.mts.service.LoginServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginServiceImpl loginService;

	public void setLoginService(LoginServiceImpl loginService) {
		this.loginService = loginService;
	}
	
	@Autowired
	LoginDaoImpl loginDao;

	public void setLoginDao(LoginDaoImpl loginDao) {
		this.loginDao = loginDao;
	}

	@GetMapping(value="/owner",produces="application/json")
	public ResponseEntity<String> ownerLogin(@RequestBody OwnerLogin owner){
		String message=loginService.getOwnerPassword(owner.getUsername(), owner.getPassword());
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
	
	@GetMapping(value="/manager",produces="application/json")
	public ResponseEntity<String> managerLogin(@RequestBody ManagerLogin manager){
		String message=loginService.getManagerPassword(manager.getUsername(), manager.getPassword());
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
	
	@GetMapping(value="/member",produces="application/json")
	public ResponseEntity<String> memberLogin(@RequestBody OfficeMemberLogin member){
		String message=loginService.getMemberPassword(member.getUsername(), member.getPassword());
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
	
	
}
