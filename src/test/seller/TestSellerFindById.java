package test.seller;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class TestSellerFindById {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller;
		
		System.out.println("Seller id: ");
		int sellerId = input.nextInt();
		
		seller = sellerDao.findById(sellerId);
		
		System.out.println(seller);
		
		input.close();
	}

}
