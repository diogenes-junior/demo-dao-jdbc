package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class TestSeller {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Department obj2 = new Department(2, "Electronics");
		Department obj3 = new Department(1, "Others");
		
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println("obj == obj2: " + obj.equals(obj2));
		System.out.println("obj == obj3: " + obj.equals(obj3));
		
//--------------------------------------------------------------------------------

		Seller s1 = new Seller(1, "Diógenes", "diogenes@gmail.com", sdf.parse("08/10/1974"), 3000.00, obj);
		Seller s2 = new Seller(2, "Daniele", "daniele@gmail.com", sdf.parse("04/12/1977"), 3500.00, obj2);
		
		System.out.println("Seller");
		System.out.println("s1" + s1);
		System.out.println("s1" + s2);
		System.out.println("s1 == s2 " + s1.equals(s2));
				
	}

}
