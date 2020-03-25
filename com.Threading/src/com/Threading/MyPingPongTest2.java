package com.Threading;
public class MyPingPongTest2 extends Thread {
    
    public MyPingPongTest2(String threadName) {
    	super.setName(threadName);
    	super.start();
    }
    
    public static void main(String[] args) {
    	new MyPingPongTest2("PING") {
    		 public void run1() {
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
    		 
    		 }
    	};
    	new MyPingPongTest2("PONG") {
    		 public void run2() {
    			 Thread currThread=Thread.currentThread();
    		 if(currThread.getName().equals("PONG")) {
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
    };
    	
    	
   
   	}

    
	
}

