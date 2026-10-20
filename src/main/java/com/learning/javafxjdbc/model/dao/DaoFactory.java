package com.learning.javafxjdbc.model.dao;


import com.learning.javafxjdbc.db.DB;
import com.learning.javafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.learning.javafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
