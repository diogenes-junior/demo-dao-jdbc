package test.seller;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class TestSellerFindAll {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		List<Seller> sellers = new ArrayList<>();  
		sellers = sellerDao.findAll();

		for(Seller obj:sellers) {
			System.out.println(obj);
		}
	}

}
