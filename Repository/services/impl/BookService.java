package services.impl;

import java.util.List;
import java.util.Optional;

import entities.Book;
import repositories.IBookRepository;
import services.IBookService;

public class BookService implements IBookService {
    private IBookRepository bookRepository;

    public BookService (IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.add(book);
    }

    @Override
    public void removeBook(Book book) {
        bookRepository.remove(book);
    }

    @Override
    public Optional<Book> getBookById(int id) {
        return bookRepository.getById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAll();
    }
}
