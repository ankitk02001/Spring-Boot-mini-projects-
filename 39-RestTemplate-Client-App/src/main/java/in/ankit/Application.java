package in.ankit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
		// Create RestTemplate instance
        RestTemplate restTemplate = new RestTemplateBuilder().build();
     
        // Define URL
        String url = "http://localhost:9090/products";

        // Send GET request and retrieve response
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        // Print response body
        System.out.println("Response Body: " + responseEntity.getBody());
    }
	
	}
	
	

