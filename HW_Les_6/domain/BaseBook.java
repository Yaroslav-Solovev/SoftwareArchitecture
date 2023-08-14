package HW_Les_6.domain;
import java.util.ArrayList;

import HW_Les_6.console.ConsoleLine;
import HW_Les_6.console.ConsoleNumber;

public class BaseBook {

    public static ArrayList<Book> allBooks;

    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
        
    public static ArrayList<Book> printBooks() throws Exception {
        Book books = new Book("1", "Cats", "Petrov R.D.", 230.5);
        ArrayList<Book> allBooks = new ArrayList<Book>();
        allBooks.add(books);
        return allBooks;
    }
}
