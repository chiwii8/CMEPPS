package pkg.core.driven_ports;

import pkg.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}
