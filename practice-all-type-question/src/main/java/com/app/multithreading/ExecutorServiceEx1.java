package com.app.multithreading;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx1 {
   public static void main(String[] args) {
	  Random random=new Random();
	  ExecutorService es=Executors.newFixedThreadPool(3);
	  long processingTime=6000;
	  for(int i=0;i<10;i++) {
	    
	   // processingTime +=random.nextInt(500);
	    Runnable task=new PrintTask("Printer "+i, processingTime);
	    es.execute(task);
	    
	  }
	  es.shutdown();
   }
}

class PrintTask implements Runnable{
	String printerName;
	long processingTime;
	PrintTask(String printerName,long processingTime){
		this.printerName=printerName;
		this.processingTime=processingTime;
	}
	public void run() {
		System.out.println("Th:"+Thread.currentThread().getName()+"executing by :"+printerName+" wait for :"+processingTime);
		try {
			Thread.sleep(processingTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
