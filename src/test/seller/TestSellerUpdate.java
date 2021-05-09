package test.seller;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class TestSellerUpdate {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("UPDATE NAME FROM Di�genes TO Di�genes da Silva J�nior");
		Seller seller = sellerDao.findById(9);
		seller.setName("Di�genes da Silva J�nior");
		sellerDao.update(seller);
		
		System.out.println("Seller: " + seller);	
	}

}
