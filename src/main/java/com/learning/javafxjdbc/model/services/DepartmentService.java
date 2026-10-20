package com.learning.javafxjdbc.model.services;

import com.learning.javafxjdbc.model.dao.DaoFactory;
import com.learning.javafxjdbc.model.dao.DepartmentDao;
import com.learning.javafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll(){
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj){
        if(obj.getId() == null){
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }
}
