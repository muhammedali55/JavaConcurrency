package com.muhammethoca;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Runner_Send {
    public static long whatisloop = 0;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            Future<?> future = executorService.submit(()->{
                for(long i=0;i<2_000_000_000l;i++){
                    whatisloop++;
                }
                System.out.println("whatisloop = " + whatisloop);
            });
            future.get(1, TimeUnit.SECONDS);
            System.out.println("Reached!");
        }catch (Exception e) {
            System.out.println("Not reached in time..: "+e.toString());
        }finally{
            executorService.shutdown();
        }
    }
}
