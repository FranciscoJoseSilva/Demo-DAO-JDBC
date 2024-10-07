package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		//Teste
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		Department department = new Department(2, "Electronics");
		List<Seller> sellers = sellerDao.findByDepartment(department);
		
		sellers.forEach(System.out::println);
		
	}
}
