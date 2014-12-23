package com.tkbaru.service;

import java.util.List;

import com.tkbaru.model.Product;

public interface ProductService {
	public List<Product> getAllProduct();
	public Product getProductById(int selectedId);
	public void addProduct(Product product);
	public void editProduct(Product product);
	public void deleteProduct(int selectedId);

}
