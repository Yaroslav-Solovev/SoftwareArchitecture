package HW_Les_6.operations;

import java.util.ArrayList;
import HW_Les_6.domain.BaseBook;
import HW_Les_6.domain.Book;

public class OutAllBooks{ //** Вывод всей базы книг*/
    public static BaseBook enterBase = new BaseBook();
   
    public static ArrayList<Book> getAllBooks() throws Exception {
        ArrayList<Book> books = enterBase.printBooks();
        for (int i = 0; i < books.size(); i++) { 
            System.out.println(books.get(i).getInfo());
        }
        return books;
    } 
}
