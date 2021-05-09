package test.seller;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class TestSellerUpdate {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("UPDATE NAME FROM Diógenes TO Diógenes da Silva Júnior");
		Seller seller = sellerDao.findById(9);
		seller.setName("Diógenes da Silva Júnior");
		sellerDao.update(seller);
		
		System.out.println("Seller: " + seller);	
	}

}
