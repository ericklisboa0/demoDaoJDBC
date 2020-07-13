package model.dao;

import java.util.List;

import model.entities.Seller;

public interface sellerDao {

	void insert(Seller dep1);
	void update(Seller dep1);
	void deleteById(Integer id);
	Seller FindById(Integer id);
	List<Seller> findAll();
	
}
