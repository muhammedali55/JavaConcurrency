package com.muhammethoca;

import java.util.concurrent.*;

public class Runner_Scheduling {
    public static void main(String[] args) {
        ScheduledExecutorService service  = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () ->     System.out.println("Hello Zoo");
        Callable<String> task2 = () ->   "Monkey";
        ScheduledFuture<?> r1 = service.schedule(task1, 8, TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = service.schedule(task2, 4, TimeUnit.SECONDS);
        /**
         * DİKKAT!!!
         * Gerçek ortamda planlanan tasklar görev almaya bilir böyle bir durumda
         * iş parçacığı kuyrukta bekler.
         * Ayrıca, ExecutorService zamanından önce kapatılırsa, tüm görevler
         * iptal olur.
         */
    }
}
