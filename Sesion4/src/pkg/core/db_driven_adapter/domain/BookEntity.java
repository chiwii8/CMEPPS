package pkg.core.db_driven_adapter.domain;

import javax.persistence.*;

import pkg.core.domain.Book;


@Entity
public class BookEntity { 
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(name = "name")
private String name;
   
//constructors //getters and setters 

   
public Book toBook(){
return new Book(this.id, this.name);   
}

public BookEntity(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
