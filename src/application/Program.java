package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		//Teste
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Department department = new Department(1, "Computers");
		Seller seller = new Seller(1, "Teste 0", "teste@gmail.com", new Date(), 1000.00, department);
		
		sellerDao.deleteById(seller.getId());
		
	}
}
