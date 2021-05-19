package com.cg.datajpa.mts.service;

public interface ILoginService {
	public String getManagerPassword(String username,String password) ;
	public String getMemberPassword(String username,String password) ;
	public String getOwnerPassword(String username,String password) ;

}