package Structural.Adapter;

public class Client {
    private final  Printer printer;
    public Client(Printer printer){
        this.printer=printer;
    }
    public void dosomething(){
        printer.print();
    }
}
