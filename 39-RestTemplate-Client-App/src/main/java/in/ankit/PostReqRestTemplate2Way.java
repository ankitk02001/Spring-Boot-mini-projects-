package in.ankit;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.ankit.bindingforPostReq.Product;

public class PostReqRestTemplate2Way {

	public static void main(String[] args) {
		 // Create RestTemplate instance
        RestTemplate rt = new RestTemplateBuilder().build();

        // Define URL
        String url = "http://localhost:9090/product";
        Product product=new Product();
        product.setProductName("Neha");
        product.setProductPrice(345.45);
        
        ResponseEntity<String> postForEntity = rt.postForEntity(url, product, String.class);
        String body = postForEntity.getBody();
        System.out.println("Response from post Request 2 by :"+body);
	}
}
