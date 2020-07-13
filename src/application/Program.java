package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department dep = new Department(1, "books");
		System.out.println(dep);
		
		Seller seller = new Seller(2, "erick", "erickllm", new Date(), 3500.00, dep);
		System.out.println(seller);
		
	}

}
