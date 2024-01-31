package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repository;

	@Override
	public String upsertBook(Book book) {
		repository.save(book);
		return "save and updated";
	}

	@Override
	public List<Book> getAllBook() {
		return repository.findAll();
	}


	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		repository.deleteById(bookId);
		return "record deleted";
	}

}
