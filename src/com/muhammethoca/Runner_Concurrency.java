package com.muhammethoca;

public class Runner_Concurrency {
    public static void main(String[] args) {

        /**
         * ** Kavramlar ***
         * CPU: İşlemci
         * Process: İŞletim sistemi tarafından yönetiLen herbir işlem.bir iş parçacığı
         * işletim sistemi tarafından programlanabilen en küçük yürütme birimidir.
         * Thread: Uygulamaları koşturan yapılardır.
         * Uygulamanız siz bir thread belirlemesenizde main thread üzerinde çalışır.
         * Burada karşımıza 2 konu çıkıyor.
         * Parallelism; bir den fazla işin birden fazla çekirdekte aynı anda koşturulmasıdır.
         * kavramak ve kullanmak kolaydır.
         * Concurrency: birden fazla işin tek bir çekirdek üzerinde koşturulmasıdır.
         * Bir örnek verelim;
         * bir iş yerinde kasiyer hesapları alıyor. iş yoğunluğu olduğunda yani insanlar ödeme yapmak
         * için yığıldığında , ikinci bir kasiyer daha eklenerek işler 2X daha hızlı yapılabilir. işte
         * bu işleme paralel programlama denir.
         * peki böyle bir yoğunlukta, tek kişi aynı anda müşterileri almaya kalkarsa. mesela birsinin ödemesini
         * almak için kartını alıp işlemlere devam ederken, diğer taraftan sonra gelen kişinin ürürnlerini okutmaya
         * başlayabilir.
         * Tam olarak oturmasa da aslında tek çekirdekte böyle bir işlem yürütmektedir. aynı anda başlattığı işlere
         * müdehale ederek işlerin aynı anda yürütülmesini sağlamaktadır.
         *
         */
        Runnable printInventory = () ->
                System.out.println("Printing zoo inventory");
        Runnable printRecords = () ->
        {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };
        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();
        System.out.println("end");


    }
}
