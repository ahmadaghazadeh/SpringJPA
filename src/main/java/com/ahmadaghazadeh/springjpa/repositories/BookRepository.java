package com.ahmadaghazadeh.springjpa.repositories;

import com.ahmadaghazadeh.springjpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
