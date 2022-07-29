package com.muhammethoca;

public class Runner_Volatile {
    public static void main(String[] args) {
        Deger d = new Deger();
        d.sayi = 20;
        MyThread t1 = new MyThread(d);
        MyRunnable t2 = new MyRunnable(d);
        Thread t = new Thread(t2);
        t.start();
        t1.run();
    }
}
class MyThread extends Thread {
    Deger d;
    public MyThread(Deger d) {
        this.d = d;
    }
    public void run() {
        for(int i=0;i<10;i++) {
            d.sayi++;
            System.out.println("Thread : " + d.sayi);
        }
    }
}
class MyRunnable implements Runnable {
    Deger d;
    public MyRunnable(Deger d) {
        this.d = d;
    }
    public void run() {
        for(int i=0;i<10;i++) {
            d.sayi--;
            System.out.println("Runnable : " + d.sayi);
        }
    }
}
 class Deger{
   volatile int sayi;
}