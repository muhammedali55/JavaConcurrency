package com.muhammethoca;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner_Synchronized {
    private int count = 0;
    private void increment() {
        synchronized (this) {
            System.out.print((++count)+" ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try{
            var manager = new Runner_Synchronized();
            for (int i = 0; i < 10; i++) {
                service.submit(manager::increment);
            }
        }finally {
            service.shutdown();
        }
    }
}
