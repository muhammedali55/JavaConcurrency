package com.muhammethoca;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Runner_ThredSafety {
	AtomicInteger The_number_of_participants = new AtomicInteger(0);
		//The_number_of_participants.incrementAndGet(); ++value
		//The_number_of_participants.decrementAndGet(); --value
		//The_number_of_participants.get();
		//The_number_of_participants.set(0);
		//The_number_of_participants.getAndIncrement(); value++
		//The_number_of_participants.getAndDecrement(); value--
		 private void incrementAndReport() {
		 System.out.print((The_number_of_participants.incrementAndGet())+" ");
		 }
 public static void main(String[] args) {
		 ExecutorService service = Executors.newFixedThreadPool(20);
		 try {
			 Runner_ThredSafety manager = new Runner_ThredSafety();
		 for(int i = 0; i < 10; i++)
			  service.submit(() ->
					manager.incrementAndReport());
			} finally {
			 service.shutdown();
			 }
		 }
}
