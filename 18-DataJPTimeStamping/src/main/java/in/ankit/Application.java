package in.ankit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ankit.entity.Product;
import in.ankit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	ProductRepository repository = context.getBean(ProductRepository.class);
	 Product product=new Product();
	 product.setPid(101);
	 product.setPname("Aman");
	 product.setPrice(23.34);
	 product.setPname("Glass");
	 repository.save(product);
	 
	 Product product1=new Product();
	 product1.setPid(102);
	 product1.setPrice(null);
	 product1.setPname("Laptop");
	 product1.setPname("Headphone");
	 repository.save(product1);
	}

}