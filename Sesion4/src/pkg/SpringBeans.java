package pkg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pkg.core.BookServiceImpl;
import pkg.core.driven_ports.BookRepository;
import pkg.core.driver_ports.BookService;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);
}
}
