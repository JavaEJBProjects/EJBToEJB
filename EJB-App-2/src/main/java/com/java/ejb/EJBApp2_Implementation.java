package com.java.ejb;


import java.util.Properties;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

/**
 * Session Bean implementation class EJBApp2_Implementation
 */
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.ejb.EJBApp1_Interface;

@Stateless(mappedName="ejb/authtest")
@Remote(EJBApp2_Interface.class)
//@TransactionManagement(TransactionManagementType.BEAN)
public class EJBApp2_Implementation implements EJBApp2_Interface {
	
	Context context;
	int a;
	private static final String JNDI = "java:global/EJBAppEar/RemoteImplement!com.java.ejb.RemoteInterface";
	//@EJB(name="baseApp/remoteImp")
	//public RemoteInterface remote;
	public EJBApp2_Implementation() throws NamingException
	{
		
		// remote = (RemoteInterface)context.lookup(JNDI);
		 //remote1 = (RemoteInterface)context.lookup("java:global/ejb/remote");
		// remote2=(RemoteInterface)context.lookup(JNDI);
	}

	@Override	
	public int add(int a1,int b1) throws NamingException
	{
		Properties props = new Properties();

		  props.setProperty("java.naming.factory.initial",
		                    "com.sun.enterprise.naming.SerialInitContextFactory");

		  props.setProperty("java.naming.factory.url.pkgs",
		                    "com.sun.enterprise.naming");

		  props.setProperty("java.naming.factory.state",
		                    "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");


		  // optional.  Defaults to localhost.  Only needed if web server is running
		  // on a different host than the appserver   
		  //props.setProperty("org.omg.CORBA.ORBInitialHost", "ejb_server_ip_or_host_name");

		  // optional.  Defaults to 3700.  Only needed if target orb port is not 3700.
		 // props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

		context= new InitialContext();
		
		EJBApp1_Interface remote=(EJBApp1_Interface)context.lookup("baseApp/remoteImp"); 
		remote.printMessage();
		a=remote.sum(3,3);
		return a1+b1+a;
	}
	
	public void getContext() throws NamingException
	{
		
		
	}



	@Override
	public String printMessage() {
		return "Invoking sum(3,3) of EJBApp2 internally from method add(int a1,int b1) of EJBApp2";
		
	}
}

