package com.bluesoft.spring5webappexample.repositories;

import com.bluesoft.spring5webappexample.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
