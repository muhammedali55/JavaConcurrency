package com.muhammethoca;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner_Callable implements Callable<String> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<String> result = service.submit(() -> "Merhaba Dünyalı, Ben Java gezegeninden geliyorum.");
            System.out.println(result.get());
        } finally {
            service.shutdown();
        }
    }

    @Override
    public String call() throws Exception {
        return null;
    }
}
