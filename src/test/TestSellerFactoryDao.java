package test;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class TestSellerFactoryDao {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

	}

}
