package com.training.spring;

import javax.inject.Named;

import org.apache.log4j.Logger;

public class MoreMathUtilCoolImpl implements MoreMathUtil {
	   static Logger log = Logger.getLogger(MoreMathUtil.class);


	public MoreMathUtilCoolImpl() {
		
		log.info("MoreMathUtilCoolImpl class instantiate");
	}
	
	public Integer squareRoot(Integer a) {
		// TODO Auto-generated method stub
		return a;
	}

}
