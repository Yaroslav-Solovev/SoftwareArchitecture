package HW_Les_6.data;

import java.util.Scanner;

public class InMemoryBookRepository implements BookRepository{
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}
