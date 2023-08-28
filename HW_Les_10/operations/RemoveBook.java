package HW_Les_10.operations;

import java.util.ArrayList;
import java.util.List;

import HW_Les_10.console.ConsoleLine;
import HW_Les_10.domain.OrderItem;
import HW_Les_10.domain.Product;

public class RemoveBook {
    public static OrderItem enterBase = new OrderItem();
    public static ConsoleLine consoleLine = new ConsoleLine();
    
    public static List<Product> removeBook() throws Exception { //** Удаление книги из заказа */
        System.out.println("Введите название книги: ");
        String titleBook = new String (consoleLine.getString());
        ArrayList<Product> books = enterBase.printBooks();
        for (int i = 0; i < books.size(); i++) { 
            if (books.get(i).getTitle().equalsIgnoreCase(titleBook) == true){
                books.remove(i);
            }
        }
        return books;
    }
}
