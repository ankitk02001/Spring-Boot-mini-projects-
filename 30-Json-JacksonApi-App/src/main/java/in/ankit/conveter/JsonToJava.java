package in.ankit.conveter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ankit.binding.Book;

public class JsonToJava {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File jsonFile = new File("book.json");
		ObjectMapper mapper = new ObjectMapper();
		Book book = mapper.readValue(jsonFile, Book.class);
		System.out.println(book);
	}

}
