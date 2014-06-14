package com.training.model;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.MathUtil;

public class DAOTest {
	

	static Logger log = Logger.getLogger(DAOTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stubD
	
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring-beans.xml");
		
		DepartmentService depService = (DepartmentService)context.getBean("departmentServiceImpl");
		
		log.info("venu" + depService.departmentLogic(1L));


	}

}
