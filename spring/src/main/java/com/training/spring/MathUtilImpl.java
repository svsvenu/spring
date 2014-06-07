package com.training.spring;

import javax.inject.Inject;
import javax.inject.Named;
import org.apache.log4j.Logger;


@Named
public class MathUtilImpl implements MathUtil {
	
	   static Logger log = Logger.getLogger(MathUtil.class);

	@Inject
	MoreMathUtil moreMathUtil;
	

	public Integer add(Integer a, Integer b) throws Exception {
		// TODO Auto-generated method stub
		
		Integer sum = a + b;
		
	
		
		return sum;

	}

	public Integer subtract(Integer a, Integer b) throws Exception {
		// TODO Auto-generated method stub
		
		Integer diff = a- b;
		
		return diff;

	}

	public Integer divide(Integer a, Integer b) throws Exception {
		// TODO Auto-generated method stub
		
		Integer quo = a/b;
		
		return quo;

	}

	public Integer multiply(Integer a, Integer b) throws Exception {
		// TODO Auto-generated method stub
		
		Integer product = a*b;
		
		return product;

	}
	
	public Integer cube(Integer a){
		
		Integer cube = a * a * a;
		
		return cube;
		
	}

}
