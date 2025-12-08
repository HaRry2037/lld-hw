package com.bunny.design;




public class MySingleton {
    private static  MySingleton INSTANCE= null;

    private MySingleton(){}

    public  static MySingleton getInstance(){
        if(INSTANCE== null){
            synchronized (MySingleton.class){
                if (INSTANCE==null){
                    INSTANCE= new MySingleton();
                }
            }
        }
        return INSTANCE;
    }
}


