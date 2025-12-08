import com.bunny.design.MySingleton;

public class Main {
public static void main(String[] args){
//    MySingleton obj1= MySingleton.getInstance();
//    MySingleton obj2= MySingleton.getInstance();
//
//    System.out.println(obj1);
//    System.out.println(obj2);

    Thread t1= new Thread(new Singeltonthread());
    Thread t2= new Thread(new Singeltonthread());
    Thread t3= new Thread(new Singeltonthread());

    t1.start();
    t2.start();
    t3.start();


}
}

class Singeltonthread implements Runnable{
    @Override
    public void run(){
        MySingleton object= MySingleton.getInstance();
        System.out.println(object);

    }
}