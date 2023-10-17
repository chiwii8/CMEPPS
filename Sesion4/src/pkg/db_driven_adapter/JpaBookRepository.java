package pkg.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pkg.core.db_driven_adapter.domain.BookEntity;
import pkg.core.db_driven_adapter.jparepository.HAAJpaRepository;
import pkg.core.domain.Book;
import pkg.core.domain.BookDoesNotExistException;
import pkg.core.driven_ports.BookRepository;

@Component
public class JpaBookRepository implements BookRepository{
	@Autowired //enlaza repositorio y servicio
	private HAAJpaRepository haaJpaRepository;
	
	    @Override
	public Book findById(Long id) {
	    	Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
	    	BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
	    	return bookEntity.toBook();
	}
}
