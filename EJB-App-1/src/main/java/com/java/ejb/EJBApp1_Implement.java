package com.java.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(mappedName="baseApp/remoteImp")
@Remote
public class EJBApp1_Implement implements EJBApp1_Interface {

	@Override
	public int sum(int num1, int num2) {
		printMessage();
		return num1+num2;
	}

	@Override
	public void printMessage() {
		System.out.println("EJB calling From Service App: EJBApp1");
		
	}
	

}
