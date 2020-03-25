package com.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(2);
        Runnable runnable1=new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("PING");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
			}
        };
        
        executorService.execute(runnable1);
       // executorService.shutdown();
        Runnable runnable2=new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
			}
        };
        executorService.execute(runnable2);
        executorService.shutdown();
	
	}
}
