import java.util.Optional;

import entities.Book;
import repositories.IBookRepository;
import repositories.impl.BookRepository;
import services.IBookService;
import services.impl.BookService;

public class BookRepositoryTest {
    public static void main(String[] args) {
        // Criando um repositório de livros
        IBookRepository bookRepository = new BookRepository();

        // Criando um serviço de livros com o repositório criado
        IBookService bookService = new BookService(bookRepository);

        // Criando alguns livros
        Book book1 = new Book(1, "Book 1", "Author 1", "Category 1", true);
        Book book2 = new Book(2, "Book 2", "Author 2", "Category 2", true);
        Book book3 = new Book(3, "Book 3", "Author 3", "Category 3", true);

        // Adicionando alguns livros
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        // Obtendo um livro por ID
        int bookId = 2;
        Optional<Book> optionalBook = bookService.getBookById(bookId);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            System.out.println("Livro encontrado:");
            System.out.println("ID: " + book.getId());
            System.out.println("Título: " + book.getTitle());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Categoria: " + book.getCategory());
            System.out.println("Disponível: " + book.isAvailable());
        } else {
            System.out.println("Livro com ID " + bookId + " não encontrado.");
        }

        // Obtendo todos os livros e imprimindo
        System.out.println("\nLista de todos os livros:");
        for (Book book : bookService.getAllBooks()) {
            System.out.println("ID: " + book.getId());
            System.out.println("Título: " + book.getTitle());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Categoria: " + book.getCategory());
            System.out.println("Disponível: " + book.isAvailable());
            System.out.println();
        }

        // Removendo um livro
        bookService.removeBook(book3);

        System.out.println("\nLista de todos os livros:");
        for (Book book : bookService.getAllBooks()) {
            System.out.println("ID: " + book.getId());
            System.out.println("Título: " + book.getTitle());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Categoria: " + book.getCategory());
            System.out.println("Disponível: " + book.isAvailable());
            System.out.println();
        }
    }
}
