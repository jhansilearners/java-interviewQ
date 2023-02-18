package com.app.kk.desionpattern;

public class Singleton {
    private static Singleton soleInstance=null;
	private Singleton(){
	   
   }

	public static Singleton getInstance() {
		if (soleInstance == null) {
			synchronized (Singleton.class) {
				soleInstance = new Singleton();
		    }

		}
		return soleInstance;
	}
	
	
}
