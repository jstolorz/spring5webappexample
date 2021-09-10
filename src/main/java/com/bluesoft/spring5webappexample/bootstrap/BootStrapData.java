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
        Author eric = new Author("Eric","Evens");
        Book ddd = new Book("domain driven Design","12121212");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Book noEjb = new Book("J2EE Development without EJB","3232323232");
        eric.getBooks().add(noEjb);
        ddd.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEjb);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());

        Address address = new Address("Warsaw","Maz","00987");
        Publisher pwn = new Publisher("PWN",address);
        publisherRepository.save(pwn);

        System.out.println("Number of publisher: " + publisherRepository.count());

    }
}
