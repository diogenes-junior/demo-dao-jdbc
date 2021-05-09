package test.seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class TestSellerInsert {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("INSERT A SELLER");
		System.out.print("Seller Name: ");
		String sellerName = input.nextLine();
		System.out.print("Seller Email: ");
		String sellerEmail = input.nextLine();
		System.out.print("Seller BirthDate: ");
		String sellerBirthDate = input.nextLine();
		System.out.print("Seller Base Salary: ");
		Double sellerBaseSalary = input.nextDouble();
		System.out.print("Department Id: ");
		Integer departmentId = input.nextInt();
		
		Seller seller = new Seller(null, sellerName, sellerEmail, 
				new java.sql.Date(sdf.parse(sellerBirthDate).getTime()),
				sellerBaseSalary, new Department(departmentId, null));
				
		sellerDao.insert(seller);
		
		System.out.println("Done! New id = " + seller.getId());
		input.close();
	}

}
