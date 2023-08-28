package HW_Les_10.domain;
import java.util.ArrayList;

import HW_Les_10.console.ConsoleLine;
import HW_Les_10.console.ConsoleNumber;

public class OrderItem {

    public static ArrayList<Product> allBooks;

    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
        
    public static ArrayList<Product> printBooks() throws Exception {
        Product books1 = new Product("1", "Cats", "Petrov R.D.", 230.5);
        Product books2 = new Product("2", "Dogs", "Ivanov P.O.", 200.9);
        Product books3 = new Product("3", "Fox", "Zverova N.M.", 250.2);
        Product books4 = new Product("4", "Pigs", "Ivanov P.O.", 120.9);
        ArrayList<Product> allBooks = new ArrayList<Product>();
        allBooks.add(books1);
        allBooks.add(books2);
        allBooks.add(books3);
        allBooks.add(books4);
        return allBooks;
    }
}
