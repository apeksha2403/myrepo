package com.Threading;
public class DaemonTest extends Thread {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("PING");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r3 = new Runnable() {
			public void run() {
				for(;;) {
					System.out.println("\t\tTONG");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		DaemonTest runnable = new DaemonTest();  
         ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
		Thread t1 = new Thread(tg1,r1);
		Thread t2 = new Thread(tg1,r2);
		Thread t3 = new Thread(tg1,r3);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		  System.out.println("Thread Group Name: "+tg1.getName());  
	         tg1.list();
	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		 System.out.println(Thread.currentThread().getName());
		if(currentThread.getName().equals("PING")) {
			for(int i=0;i<20;i++) {
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("PONG")) {
			for(int i=0;i<20;i++) {
				System.out.println("\tPONG");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
