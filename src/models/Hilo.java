package models;

import java.util.concurrent.Semaphore;

public class Hilo extends Thread{
    private Operations op;

    public Hilo(Operations op){
        this.op = op;
    }
    @Override
    public void run(){
        System.out.println("Soy el hilo: "+ Thread.currentThread().getName());
        op.sum();
    }
}
