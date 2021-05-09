package test.department;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TestDepartmentFindById {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = null;
		
		System.out.print("Department Id: ");
		int depId = input.nextInt();
		department = departmentDao.findById(depId);
		
		if(department != null)
			System.out.println(department);
		else
			System.out.println("Not found.");
		
		input.close();
	}

}
