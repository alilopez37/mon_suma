import models.Hilo;
import models.Operations;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Operations obj;

        System.out.println("Soy el hilo: "+ Thread.currentThread().getName());
        obj = new Operations();

        Thread h1 = new Hilo(obj);
        h1.start();
        Thread h2 = new Hilo(obj);
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(obj.getTotal());
        System.out.println("Main terminó");
    }
}