package in.ankit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ankit.binding.Product;

@RestController
public class ProductController {

	@GetMapping(value="/products", produces = {"application/json","application/xml"})
	public ResponseEntity<List<Product>> getProduct(){
		Product product=new Product();
		product.setProductId(101);
		product.setProductName("Laptop");
		product.setProductPrice(34522.45);
		
		Product product1=new Product();
		product1.setProductId(102);
		product1.setProductName("tablet");
		product1.setProductPrice(2422.45);
		List<Product> productObj = Arrays.asList(product,product1);
	return new ResponseEntity<>(productObj,HttpStatus.OK);
		
	}
}