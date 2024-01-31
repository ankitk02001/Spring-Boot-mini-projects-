package in.ankit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ankit.entity.Product;
import in.ankit.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Override
	public String upsertData(Product product) {
		Product save = productRepository.save(product);
		return "Data is saved or updated";
	}

	@Override
	public Product getDatabyId(Integer id) {
		Optional<Product> findById = productRepository.findById(id);
		return findById.orElseThrow();
	}

	@Override
	public List<Product> getAllData() {
		List<Product> findAll = productRepository.findAll();
		return findAll;
	}

	@Override
	public String deleteById(Integer id) {
		productRepository.deleteById(id);
		return "Account Deleted";
	}

}
