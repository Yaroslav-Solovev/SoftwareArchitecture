package HW_Les_10.domain;

import java.util.ArrayList;
import java.util.List;

import HW_Les_10.console.ConsoleLine;
import HW_Les_10.domain.OrderItem;
import HW_Les_10.domain.Product;

public class Order { //** Расчет суммы заказа */
    public static OrderItem enterBase = new OrderItem();
    public static ConsoleLine consoleLine = new ConsoleLine();
    

    public static void sumOrder() throws Exception {
        Double sum = 0.01*0;
        ArrayList<Product> books = enterBase.printBooks();
        for (int i = 0; i < books.size(); i++) { 
            sum = sum + books.get(i).getPrice();
        }
        Double result = (double) (sum);
        System.out.println("Сумма Вашего заказа составляет: " + result);
    } 
}