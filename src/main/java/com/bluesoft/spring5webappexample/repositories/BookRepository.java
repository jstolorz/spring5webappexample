package com.bluesoft.spring5webappexample.repositories;

import com.bluesoft.spring5webappexample.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
