package org.books.booksmanager.database.repository;

import org.books.booksmanager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Book, Long> {
}
