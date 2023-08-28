package HW_Les_10.operations;

import java.util.ArrayList;

import HW_Les_10.console.ConsoleLine;
import HW_Les_10.console.ConsoleNumber;
import HW_Les_10.domain.Product;

public class AddBook{
    public static ArrayList<Product> allBooks;

    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
        
    public static ArrayList<Product> addBook() throws Exception {
        Product books = new Product(null, null, null, null);
        System.out.println("Введите следующую информацию по книге: ");
        System.out.println("Введите id: ");
        books.setId(consoleLine.getString());
        System.out.println("Введите название книги: ");
        books.setTitle(consoleLine.getString());
        System.out.println("Введите автора книги: ");
        books.setAuthor(consoleLine.getString());
        System.out.println("Введите стоимость книги: "); 
        books.setPrice(consoleNumber.getNum());

        ArrayList<Product> allBooks = new ArrayList<Product>();
        allBooks.add(books);
        return allBooks;
    }
}
