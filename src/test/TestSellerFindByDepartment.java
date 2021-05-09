package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class TestSellerFindByDepartment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		SellerDao sellerDao =  DaoFactory.createSellerDao();
		Department department = new Department();
		List<Seller> sellers = new ArrayList<>();
		
		System.out.println("Search seller for department");
		System.out.println("Department Id: ");
		department.setId(input.nextInt());
		
		sellers = sellerDao.findByDepartment(department);
		
		for(Seller obj : sellers) {
			System.out.println(obj);
		}
		
		input.close();
	}

}
