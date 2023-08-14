package HW_Les_6.operations;

import java.util.ArrayList;
import java.util.List;

import HW_Les_6.console.ConsoleLine;
import HW_Les_6.domain.BaseBook;
import HW_Les_6.domain.Book;

public class RemoveBook {
    public static BaseBook enterBase = new BaseBook();
    public static ConsoleLine consoleLine = new ConsoleLine();
    
    public static List<Book> removeBook() throws Exception { //** Удаление данных о книге */
        System.out.println("Введите название книги: ");
        String titleBook = new String (consoleLine.getString());
        ArrayList<Book> books = enterBase.printBooks();
        for (int i = 0; i < books.size(); i++) { 
            if (books.get(i).getTitle().equalsIgnoreCase(titleBook) == true){
                books.remove(i);
            }
        }
        return books;
    }
}
