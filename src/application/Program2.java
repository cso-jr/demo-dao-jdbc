package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
	//	SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
	/*	System.out.println("=== TEST 1 : Seller find by ID ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2 : Seller find by Department ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3 : Seller find ALL ===");
	//	Department department = new Department();
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
			
		}*/
		System.out.println("\n=== TEST 4 : Department insert ===");
		Department newDepartment = new Department(null,"Musica");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + );
/*
		System.out.println("\n=== TEST 5 : Seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Update complete!");
	*/	

	}

}