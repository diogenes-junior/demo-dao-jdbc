package test.department;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class TestDepartmentFactoryDao {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		

	}

}
