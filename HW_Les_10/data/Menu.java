package HW_Les_10.data;

import HW_Les_10.operations.AddBook;
import HW_Les_10.operations.RemoveBook;
import HW_Les_10.domain.Order;

public class Menu {

    BookRepository ui;

    public Menu() {
        ui = new InMemoryBookRepository();
    }
    
    public void start() throws Exception {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Добавление книги в заказ\n")
                .append("2 - Удаление книги из заказа\n")
                .append("3 - Расчет суммы заказа\n")
                .append("0 - exit\n");
                
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    AddBook.addBook();
                    break;
                case "2":
                    RemoveBook.removeBook();
                    return;
                case "3":
                    Order.sumOrder();
                    return;
                case "0":
                    return;
                default:
                    return;
            }   
        }
    }
}
