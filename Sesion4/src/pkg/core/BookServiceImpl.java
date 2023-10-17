package pkg.core;

import pkg.core.domain.Book;
import pkg.core.driven_ports.BookRepository;
import pkg.core.driver_ports.BookService;

public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	}
	
	public Book getBook(Long id) {
	        return bookRepository.findById(id);
	}
}
