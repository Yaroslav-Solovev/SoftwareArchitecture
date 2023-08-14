package HW_Les_6.console;

import java.util.Scanner;
import HW_Les_6.data.BookRepository;

public class ConsoleView implements BookRepository{
    
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}