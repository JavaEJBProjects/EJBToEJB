package com.java.ejb;

import javax.ejb.Remote;
import javax.naming.NamingException;

@Remote
public interface EJBApp2_Interface {
	
	public int add(int a,int b) throws NamingException;
	public String printMessage();

}
