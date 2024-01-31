package in.ankit.conveter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ankit.binding.Author;
import in.ankit.binding.Book;

public class JavaToJson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Author author=new Author();
		author.setAuthorName("Ashok Kumar");
		author.setAuthorPhno("34434366");
		author.setAuthorEmail("ashok@gmail.com");
		
		Book book=new Book();
		book.setId(101);
		book.setName("SpringBoot");
		book.setPrice(355.43);
		book.setAuthor(author);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion Completed...!");
	}
}
