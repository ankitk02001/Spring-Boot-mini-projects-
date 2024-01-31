package in.ankit.service;

import java.util.List;

import in.ankit.entity.Product;


public interface ProductService {

	public String upsertData(Product product);
	public Product getDatabyId(Integer id);
	public List<Product> getAllData();
	public String deleteById(Integer id);
		
	
}
