package in.ankit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ankit.entity.Product;
import in.ankit.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	@PostMapping("/product")
	public ResponseEntity<String> saveData(@RequestBody Product product) {
		String upsertData = productServiceImpl.upsertData(product);
		return new ResponseEntity<>(upsertData, HttpStatus.OK);
	}
	@PutMapping("/product")
	public ResponseEntity<String> updateData(@RequestBody Product product){
		String upsertData = productServiceImpl.upsertData(product);
		return new ResponseEntity<String>(upsertData,HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getById(@PathVariable Integer id){
		Product databyId = productServiceImpl.getDatabyId(id);
		return new ResponseEntity<Product>(databyId,HttpStatus.OK);
	}
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> accountDelete(@PathVariable Integer id){
		String deleteById = productServiceImpl.deleteById(id);
		return new ResponseEntity<String>(deleteById,HttpStatus.OK);
	}
	@GetMapping("products")
	public ResponseEntity<List<Product>> getAllData(){
		List<Product> allData = productServiceImpl.getAllData();
		return new ResponseEntity<List<Product>>(allData,HttpStatus.OK);
	}
}
