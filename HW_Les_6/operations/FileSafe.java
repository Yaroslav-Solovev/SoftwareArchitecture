package HW_Les_6.operations;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import HW_Les_6.domain.BaseBook;
import HW_Les_6.domain.Book;


public class FileSafe {
    
    public static BaseBook enterBase = new BaseBook();
     	 
    public static void fileSafe() throws ParseException, Exception{
        String fileName = "HW_Les_6/Save/file.txt";
        ArrayList<Book> books = enterBase.printBooks();
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
