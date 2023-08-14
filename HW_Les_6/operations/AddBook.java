package HW_Les_6.operations;

import java.util.ArrayList;
import java.util.List;

import HW_Les_6.console.ConsoleLine;
import HW_Les_6.console.ConsoleNumber;
import HW_Les_6.domain.Book;

public class AddBook{
    public static ArrayList<Book> allBooks;

    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
        
    public static ArrayList<Book> addBook() throws Exception {
        Book books = new Book(null, null, null, null);
        System.out.println("Введите следующую информацию по книге: ");
        System.out.println("Введите id: ");
        books.setId(consoleLine.getString());
        System.out.println("Введите название книги: ");
        books.setTitle(consoleLine.getString());
        System.out.println("Введите автора книги: ");
        books.setAuthor(consoleLine.getString());
        System.out.println("Введите стоимость книги: "); 
        books.setPrice(consoleNumber.getNum());

        ArrayList<Book> allBooks = new ArrayList<Book>();
        allBooks.add(books);
        return allBooks;
    }
}
