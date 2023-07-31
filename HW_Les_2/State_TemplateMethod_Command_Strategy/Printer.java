package HW_Les_2.State_TemplateMethod_Command_Strategy;

public class Printer {
// обобщенный метод
    public <T> void print(T[] items){
         for(T item: items){
            System.out.println(item);
        }
    }
}
