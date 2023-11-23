package models;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Operations {
    private int total;
    public Operations(){
        total = 0;
    }
    public synchronized void sum(){
        for (int i=1;i<=10000;i++)
                total++;
        System.out.println(Thread.currentThread().getName() + "Terminó");
    }

    public int getTotal() {
        return total;
    }
}
