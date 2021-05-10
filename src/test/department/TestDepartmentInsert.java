package test.department;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TestDepartmentInsert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.print("Department name to insert: ");
		Department dep = new Department(null, input.nextLine());
		departmentDao.insert(dep);
		System.out.println("Done. Id = " + dep.getId());
		
		input.close();
	}

}
