package com.training.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
 
	MathUtil mathUtil ;
   
    static Logger log = Logger.getLogger(App.class);
	
	public MathUtil getMathUtil() {
		
	return mathUtil;
}



public void setMathUtil(MathUtil mathUtil) {
	this.mathUtil = mathUtil;
}



	public static void main( String[] args )
    {
		
	/*	MathUtil venuMathUtil;

		venuMathUtil = new MathUtilImpl();
		
		venuMathUtil = new MathUtilCoolImpl();
		
	
		try {
			
			Integer sum = venuMathUtil.add(5, 5);
			log.info("SUM of 5 and 5 is " + sum);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("/spring-beans.xml");
    	
    	for (String beanName : context.getBeanDefinitionNames()) {
        	
    		log.info("Bean name is " + beanName);
    	
    	}
    	  	
    	MathUtil mathUtil = (MathUtil)context.getBean("mathUtilImpl");
    	
    
    	  	
    }
	
}
