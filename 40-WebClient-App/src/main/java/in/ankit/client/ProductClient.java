package in.ankit.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;

import in.ankit.binding.Product;

@Service
public class ProductClient {

    public void invokeGETProductClient() {
    	
    	String apiUrl="http://localhost:9090/products";
    	WebClient client = WebClient.create();
    	String block = client.get()
    	           .uri(apiUrl)
    	           .retrieve()
    	           .bodyToMono(String.class)
    	            .block();
    	System.out.println(block);
    }
    
    public void invokePostRequest() {
        Product product = new Product();
        product.setProductName("Sakshi");
        product.setProductPrice(34.5);
        
        String apiUrl = "http://localhost:9090/product";
        
        WebClient client = WebClient.create();
        
        String response = client.post()
                .uri(apiUrl)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(product))
                .retrieve()
                .bodyToMono(String.class)
                .block();
        
        System.out.println("Response from post request: " + response);
    }}