package com.training.spring;

public class MathUtilCoolImpl implements MathUtil {

	public Integer add(Integer a, Integer b) throws Exception {
		return a + b;
	}

	public Integer subtract(Integer a, Integer b) throws Exception {
		return a -b;
	}

	public Integer divide(Integer a, Integer b) throws Exception {
		return a/b;
	}

	public Integer multiply(Integer a, Integer b) throws Exception {
		return a*b;
	}

}
