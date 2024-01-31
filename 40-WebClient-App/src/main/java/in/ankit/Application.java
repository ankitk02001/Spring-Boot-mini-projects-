package in.ankit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ankit.client.ProductClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	ProductClient bean = context.getBean(ProductClient.class);
	bean.invokeGETProductClient();
	bean.invokePostRequest();
	
	}

}
