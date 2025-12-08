package Structural.Adapter;

public class Drive {
    public static void main(String[] args){
    Client client= new Client(new PrinterAdapter( new LegacyPrinter()));
        client.dosomething();
    }

}
