package HW_Les_2.State_TemplateMethod_Command_Strategy;

public interface Actions { 
    public void speak();

    public void eat();
   
    public void run();
    
    public void makeDo();

    public default void nothing() {
        System.out.println(": :) Надо вздремнуть!");
    }
 }