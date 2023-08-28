package HW_Les_10.operations;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import HW_Les_10.domain.OrderItem;
import HW_Les_10.domain.Product;


public class FileSafe {
    
    public static OrderItem enterBase = new OrderItem();
     	 
    public static void fileSafe() throws ParseException, Exception{
        String fileName = "HW_Les_10/Save/file.txt";
        ArrayList<Product> books = enterBase.printBooks();
        for (int i = 0; i < books.size(); i++) { //** Присваивание файлу названия ввиде фамилии автора */
            fileName = fileName.replace("file", books.get(i).getAuthor()); 
        }

        try (FileWriter file = new FileWriter(fileName, true)) { //** Запись данных в файл инфы по книгам + с функцией дозаписи вслучае одинаковых авторов */
            for (int i = 0; i < books.size(); i++) { 
                file.append(books.get(i).getInfo());
                file.append('\n');
            }
            file.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
