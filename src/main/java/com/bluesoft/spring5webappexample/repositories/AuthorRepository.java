package com.bluesoft.spring5webappexample.repositories;

import com.bluesoft.spring5webappexample.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
