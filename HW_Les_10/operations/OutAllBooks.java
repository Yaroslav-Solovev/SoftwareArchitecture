package HW_Les_10.operations;

import java.util.ArrayList;
import HW_Les_10.domain.OrderItem;
import HW_Les_10.domain.Product;

public class OutAllBooks{ //** Вывод всей базы книг*/
    public static OrderItem enterBase = new OrderItem();
   
    public static ArrayList<Product> getAllBooks() throws Exception {
        ArrayList<Product> books = enterBase.printBooks();
        for (int i = 0; i < books.size(); i++) { 
            System.out.println(books.get(i).getInfo());
        }
        return books;
    } 
}
