package HW_Les_2.State_TemplateMethod_Command_Strategy.Command;

import java.util.Scanner;

public class ConsoleLine {
    static Scanner scanner = new Scanner(System.in);
    
    public String getLine() throws Exception {
        String world;
        if (scanner.hasNextLine()) {
            world = scanner.nextLine();
        } else {
            System.out.println("Error: Вы ввели не слово!");
            scanner.next();
            world = scanner.nextLine();
        }
        return world;
    }
}
