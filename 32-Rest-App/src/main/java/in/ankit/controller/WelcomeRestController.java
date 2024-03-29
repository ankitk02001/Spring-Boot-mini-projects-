package in.ankit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String resPayload = "Good Morning";
		return new ResponseEntity<String>(resPayload, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String resPayload = "Good Morning";
		return resPayload;
	}
}
