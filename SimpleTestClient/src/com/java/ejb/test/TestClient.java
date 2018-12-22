package com.java.ejb.test;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.java.ejb.EJBApp2_Interface;
//import com.java.ejb.RemoteInterface;


public class TestClient {
	
	//private static final String JNDI = "java:global/EJBApp/RemoteImplement";
	public static void main(String[] args)throws Exception {  
	    
		Context context=new InitialContext();  
	    //RemoteInterface remote=(RemoteInterface)context.lookup("st1");  
		//RemoteInterface remote = (RemoteInterface)context.lookup("ejb/remote");
		//RemoteInterface remote1 = (RemoteInterface)context.lookup("ejb/remote");
		EJBApp2_Interface remote=(EJBApp2_Interface)context.lookup("ejb/authtest");
		System.out.println(remote.printMessage());
		//RemoteInterface remote =(RemoteInterface)context.lookup("st1");  
		//System.out.println(remote.sum(32,32)); 
		//System.out.println(remote1.sum(100,32));  
		System.out.println(remote.add(100,32));  
// It will always retuen more than 6 than result as it call internally other aplication to add more to result
	}  
	

}
