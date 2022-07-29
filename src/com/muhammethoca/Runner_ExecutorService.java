package com.muhammethoca;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner_ExecutorService {

    public static void main(String[] args) {
        Runnable gorev = () ->   System.out.println("Görev çalıştı");

        Runnable gorev2 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Görev 2 çalıştı");
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            System.out.println("Başladı");
            executorService.execute(gorev);
            executorService.execute(gorev2);
            executorService.execute(gorev);
            System.out.println("Bitti");
        } finally {
            executorService.shutdown();
        }
    }
}
