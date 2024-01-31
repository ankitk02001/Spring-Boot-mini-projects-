package in.ankit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getWelcomeMsg(@RequestParam("name") String name) {
		String payload = name + " WELCOME TO IT HUB";
		return payload;
	}

	@GetMapping("/course")
	public ResponseEntity<String> getCourseTeacher(@RequestParam("course") String course,
			@RequestParam("teacher") String teacher) {
		String payload = course + " By " + teacher + " fee is 70000$";
		return new ResponseEntity<>(payload, HttpStatus.OK);
	}

	@GetMapping("/data")
	public ResponseEntity<String> getdata(
			@RequestParam("name")String name,
			@RequestParam("age")Integer age,
			@RequestParam("city")String city
			){
		String payload = "MY NAME IS " + name + ". I AM FROM " + city + ". MY AGE IS " + age + ";";
        return new ResponseEntity<String>(payload,HttpStatus.OK);
	}
}
