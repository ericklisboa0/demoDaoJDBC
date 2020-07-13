package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department dep1);
	void update(Department dep1);
	void deleteById(Integer id);
	Department FindById(Integer id);
	List<Department> findAll();
}
