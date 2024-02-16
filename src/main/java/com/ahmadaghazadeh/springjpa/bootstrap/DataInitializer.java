package com.ahmadaghazadeh.springjpa.bootstrap;

import com.ahmadaghazadeh.springjpa.domain.Book;
import com.ahmadaghazadeh.springjpa.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private  final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD=new Book("Domain Driven Design","123","RandomHouse");

        Book savedDDD=bookRepository.save(bookDDD);

        Book bookSIA=new Book("Spring in Action","123","RandomHouse");

        Book savedSIA=bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id"+book.getId());
            System.out.println("Book Id"+book.getTitle());
        });


    }
}
