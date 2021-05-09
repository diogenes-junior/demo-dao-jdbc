package test.seller;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class TestSellerDelete {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//deletar vendedor codigo 9 (Diogenes)
		sellerDao.deleteById(9);
		System.out.println("Seller deleted.");

	}

}
