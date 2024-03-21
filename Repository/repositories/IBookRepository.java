package repositories;

import java.util.List;
import java.util.Optional;

import entities.Book;

public interface IBookRepository {
    void add(Book book);
    void remove(Book book);
    Optional<Book> getById(int id);
    List<Book> getAll();
}
