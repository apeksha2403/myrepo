package com.Threading;
public class MyPingPongTest1 extends Thread {
    
    public MyPingPongTest1(String threadName) {
    	super.setName(threadName);
    	super.start();
    }
    
    public static void main(String[] args) {
    	new MyPingPongTest1("PING");
    	new MyPingPongTest1("PONG");
   
   	}

    public void run() {
    	Thread currThread=Thread.currentThread();
    	if(currThread.getName().equals("PING")) {
    		for(int i=0;i<20;i++) {
    			System.out.println("PING");
    			try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		}
    	}
    	else if(currThread.getName().equals("PONG")) {
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

