package com.training.spring;

import javax.inject.Named;

import org.apache.log4j.Logger;

@Named
public class MoreMathUtilImpl implements MoreMathUtil {
	
	   static Logger log = Logger.getLogger(MoreMathUtil.class);


	public MoreMathUtilImpl() {
		
		log.info("MoreMathUtilImpl class instantiate");
	}
	
	public Integer squareRoot(Integer a) {
		// TODO Auto-generated method stub
		return a;
	}

}
