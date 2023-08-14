package HW_Les_6.presentation;

import HW_Les_6.console.ConsoleView;
import HW_Les_6.data.Menu;

public class Main {
    public static ConsoleView enterConsoleLine = new ConsoleView();

    public static void main(String[] args) throws Exception {
        new Menu().start();
    }
}