package com.training.model;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class DepartmentServiceImpl implements DepartmentService {

	@Inject
	DepartmentDAO dept;
	
	public Department departmentLogic(Long id) {
		// TODO Auto-generated method stub
		return dept.findByPrimaryKey(id);
	}

}
