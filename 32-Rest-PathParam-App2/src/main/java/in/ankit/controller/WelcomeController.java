package in.ankit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("welcome/{name}")
	public ResponseEntity<String> getWelMsg(@PathVariable String name){
		String payload=name +" Welcome to the show";
		return new ResponseEntity<String>(payload , HttpStatus.OK);
	}
	
	@GetMapping("/greet/{name}/{city}")
	public ResponseEntity<String> getGreetmsg(@PathVariable String name,
			@PathVariable String city
			){
		String payload=name+". From"+city;
		return new ResponseEntity<String>(payload,HttpStatus.OK);
		
	}
	
	//one by using Query Parameter
	@GetMapping("/wish")
	public ResponseEntity<String> getWishMsg(@RequestParam String name){
		String payload="Best Wishes to Mr."+name;
		return new ResponseEntity<String>(payload, HttpStatus.OK);
	}
	
	@GetMapping("address/city/{city}/state/{state}/country/{country}")
	public ResponseEntity<String> getAddress(
			@PathVariable String city,
			@PathVariable String state,
			@PathVariable String country
			){
		String payload="City="+city+" State="+state+" Contry is="+country;
		System.out.println(payload);
		return new ResponseEntity<String>(payload,HttpStatus.OK);
		
	}
	
}
