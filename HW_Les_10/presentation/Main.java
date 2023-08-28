package HW_Les_10.presentation;

import HW_Les_10.console.ConsoleView;
import HW_Les_10.data.Menu;

public class Main {
    public static ConsoleView enterConsoleLine = new ConsoleView();

    public static void main(String[] args) throws Exception {
        new Menu().start();
    }
}