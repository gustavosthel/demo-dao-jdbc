package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gamil.com", d01, 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		System.out.println(seller);
	}

}
