package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class daoFactory {

	public static sellerDao createSellerDao () {
		return new SellerDaoJDBC();
	}
}
