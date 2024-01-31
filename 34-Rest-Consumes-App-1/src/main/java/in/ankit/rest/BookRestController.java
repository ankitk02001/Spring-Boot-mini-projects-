package in.ankit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ankit.binding.Book;

@RestController
public class BookRestController {
	
	@PostMapping(value = "/book", consumes = {"application/xml","application/json"},
			produces ={"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book book){
		System.out.println(book);
		//logic to store data in db need to write here
		return new ResponseEntity<>("Book Saved in Db",HttpStatus.OK);
	}

}