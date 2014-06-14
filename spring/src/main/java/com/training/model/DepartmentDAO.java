package com.training.model;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Named
public class DepartmentDAO {
	
	
	@PersistenceContext

	private EntityManager entityManager;
	
	public Department findByPrimaryKey(Long id) {
		
		printstackTrace();
		
		
		// TODO Auto-generated method stub
		if ( entityManager != null){
			
			System.out.println("Venu Entity manager is " + entityManager.toString() + "id is " + id);
		
		}
		
		System.out.println(entityManager.find(Department.class, 1L));
		return entityManager.find(Department.class, id);
	}
	
	public void printstackTrace(){
		
		
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		
		for (StackTraceElement stack : stacks){
			
			System.out.println(stack.toString());
			
		}
		
	}
	

}
