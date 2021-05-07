package test;

import model.entities.Department;

public class TestDepartment {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Department obj2 = new Department(2, "Electronics");
		Department obj3 = new Department(1, "Others");
		
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println("obj == obj2: " + obj.equals(obj2));
		System.out.println("obj == obj3: " + obj.equals(obj3));

	}

}
