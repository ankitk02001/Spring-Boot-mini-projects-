package in.ankit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ankit.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {
		Book bookobj=new Book(101,"Spring",345.56);
		model.addAttribute("book", bookobj);
		return "book";
	}
}
