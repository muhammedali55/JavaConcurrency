package com.muhammethoca;

public class Runner_LifeCycle_Sleep {
    private static long counter = 0;
    public static void main(String[] a) {
        new Thread(() ->
        {
            for(long i = 0; i < 10_000_000_000l; i++) counter++;
        }).start();
        while(counter < 10_000_000_000l) {
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1_000); // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reached: "+counter);
    }
}
