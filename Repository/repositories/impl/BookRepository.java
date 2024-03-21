package repositories.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entities.Book;
import repositories.IBookRepository;

public class BookRepository implements IBookRepository{

    private List<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public void remove(Book book) {
        books.remove(book);
    }

    @Override
    public Optional<Book> getById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst();
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

}
