package services;

import java.util.List;
import java.util.Optional;

import entities.Book;

public interface IBookService {
    void addBook(Book book);
    void removeBook(Book book);
    Optional<Book> getBookById(int id);
    List<Book> getAllBooks();
}
