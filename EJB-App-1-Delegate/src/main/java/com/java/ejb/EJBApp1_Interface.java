package com.java.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface EJBApp1_Interface {
	
	public int sum(int num1,int num2);
	public void printMessage();

}
