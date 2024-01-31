package in.ashokit.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService service;
	
	@GetMapping("/")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg="WELCOME TO ASHOK IT";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		String upsertBook = service.upsertBook(book);
		return new ResponseEntity<>(upsertBook, HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> allBook = service.getAllBook();
		return new ResponseEntity<>(allBook, HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(Book book){
		String upsertBook = service.upsertBook(book);
		return new ResponseEntity<>(upsertBook, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/book")
	public ResponseEntity<String> deleteBook(Integer bookId){
		String deleteBook = service.deleteBook(bookId);
		return new ResponseEntity<>(deleteBook, HttpStatus.OK);
	}

}
