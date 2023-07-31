package HW_Les_2.State_TemplateMethod_Command_Strategy.Command;

import java.util.Scanner;

public class ConsoleNumber {
    static Scanner scanner = new Scanner(System.in);
    
    public int getInt() throws Exception {
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error: Вы ввели не число!");
            scanner.next();
            num = getInt();
        }
        return num;
    }
}
