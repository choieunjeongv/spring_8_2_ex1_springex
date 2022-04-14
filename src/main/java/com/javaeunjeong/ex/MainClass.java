package com.javaeunjeong.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =  new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		AdminConnection adminC = ctx.getBean("adminConnection",AdminConnection.class);
		System.out.println("adminID : " + adminC.getAdminId());
		System.out.println("adminPW : " + adminC.getAdminPw());
		System.out.println("sub adminID : " + adminC.getSub_adminId());
		System.out.println("sub adminPW : " + adminC.getSub_adminPw());
	
		ctx.close();
	
	}

}
