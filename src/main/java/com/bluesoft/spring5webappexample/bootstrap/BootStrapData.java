package com.bluesoft.spring5webappexample.bootstrap;

import com.bluesoft.spring5webappexample.domain.Address;
import com.bluesoft.spring5webappexample.domain.Author;
import com.bluesoft.spring5webappexample.domain.Book;
import com.bluesoft.spring5webappexample.domain.Publisher;
import com.bluesoft.spring5webappexample.repositories.AuthorRepository;
import com.bluesoft.spring5webappexample.repositories.BookRepository;
import com.bluesoft.spring5webappexample.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(final AuthorRepository authorRepository, final BookRepository bookRepository, final PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(final String... args) throws Exception {

        Address address = new Address("St Petersburg","FL","00987");
        Publisher publisher = new Publisher("SFG Publishing",address);
        publisherRepository.save(publisher);

        publisherRepository.save(publisher);

        Author eric = new Author("Eric","Evens");
        Book ddd = new Book("domain driven Design","12121212");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod","Johnson");
        Book noEjb = new Book("J2EE Development without EJB","3232323232");
        eric.getBooks().add(noEjb);
        ddd.getAuthors().add(rod);

        noEjb.setPublisher(publisher);
        publisher.getBooks().add(noEjb);

        authorRepository.save(rod);
        bookRepository.save(noEjb);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());


        System.out.println("Number of publisher: " + publisherRepository.count());

    }
}
