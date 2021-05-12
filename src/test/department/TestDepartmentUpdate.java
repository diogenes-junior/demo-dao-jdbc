package test.department;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TestDepartmentUpdate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = null;
		
		System.out.print("Department Id to update: ");
		int depId = input.nextInt();
		System.out.print("New department name: ");
		input.nextLine();
		String depName = input.nextLine();
		dep = new Department(depId, depName);
		departmentDao.update(dep);
		
		System.out.println(dep);
		
		input.close();
	}

}
