package com.muhammethoca;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Runner_Orn01_MainThread {
    private static long starttime= 0;
    private static  String[] burclar = new String[] {"koc","boga","ikizler","yengec","aslan","basak","terazi","akrep","yay","oglak","kova","balik"};
    public static void main(String[] args) {
        String ay = "Temmuz";
        starttime = System.currentTimeMillis();
        for (String burc:burclar ) {
            burcYorumu(burc,ay);
        }



    }
    private static void burcYorumu(String burc, String ay){
        Scanner scannerSite = null;
        try {
            scannerSite = new Scanner(
                    new URL("https://www.elle.com.tr/astroloji/"+burc).openStream() , "UTF-8"
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean flag= false;
        StringBuilder alinanYorumListesi = new StringBuilder();
        while(scannerSite.hasNext()) {
            String satir = scannerSite.nextLine();
            if(satir.contains(ay.toLowerCase()))
                flag = true;
            if(satir.contains("<p>") && flag) {
                alinanYorumListesi.append(satir.replace("&rsquo;", "' ").replace("</p>", "").replace("<p>", "").replace("<br>", "")+"~");
                flag=false;
            }

        }

        String[] yorumListesi = alinanYorumListesi.toString().split("~");
        System.out.println(burc+" için Günlük Burç yorumunuz....: "+ yorumListesi[0]);
        System.out.println("PROGRAM SONLANDI.");
        System.out.println("Time finish...: "+ System.currentTimeMillis());
        System.out.println("duration......: "+ (System.currentTimeMillis() - starttime));
    }
}
