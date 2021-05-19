package com.cg.datajpa.mts.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PaymentsServiceImp implements IPaymentService {
	/*
	 * Method:processPaymentByCash Process payment by cash
	 * 
	 * CreatedBy:Ede Chandini CreatedDate:22 April 2021
	 */
	@Override
	public String processPaymentByCash() {
		System.out.println("Payment by cash method generated");
		return "Payment by cash method generated";
	}

	/*
	 * Method:processPaymentByCard Process payment by card
	 * 
	 * CreatedBy:Ede Chandini CreatedDate:22 April 2021
	 */
	@Override
	public String processPaymentByCard() {
		System.out.println("Payment by card method generated");
		return "Payment by card method generated";
	}
	
	public String Serviceone()
	{
		Random random = new Random();
		int s=random.nextInt(100) ;
		 String str1 = Integer.toString(s);
		 return str1;
	}
	

	public String Servicetwo()
	{
		Random random = new Random();
		int a=random.nextInt(100) + 100;
		 String str2 = Integer.toString(a);
		 return str2;
	}
	

	public String Servicethree()
	{
		Random random = new Random();
		int b=random.nextInt(100) + 200;
		 String str3 = Integer.toString(b);
		 return str3;
	}
	

}
