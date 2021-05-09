package test.department;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class TestDepartmentDeleteById {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.print("Department Id to delete: ");
		int depId = input.nextInt();
		departmentDao.deleteById(depId);		
		
		input.close();
	}

}
