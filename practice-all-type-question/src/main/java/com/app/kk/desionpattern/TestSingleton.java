package com.app.kk.desionpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MySingleton implements Serializable,Cloneable {
    private static MySingleton soleInstance=null;
	private MySingleton(){
	     System.out.println("inside constructor ....");
   }
   public static MySingleton getInstance() {
	   if(soleInstance==null) {
		  synchronized (MySingleton.class) {
			  soleInstance= new MySingleton(); 
		   } 
		  
	   }
	   return soleInstance;
   }
 @Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
	
	
}

public class TestSingleton{
	public static void main(String[] args) throws Exception {
		// now try with multiple thread to access the same resources 
				ExecutorService executorService=Executors.newFixedThreadPool(2);
				executorService.submit(()->{ Singleton s6=Singleton.getInstance();print("thread s6", s6);});
				executorService.submit(()->{ Singleton s6=Singleton.getInstance();print("thread s6", s6);});
				executorService.shutdown();
		
		
		
		//MySingleton s=new MySingleton(); constructor not visible 
		
		MySingleton s2=MySingleton.getInstance();
		// breaking this MySingleton using refelection 
		MySingleton s1=MySingleton.getInstance();
		print("s1",s1);//1829164700
		Class clzz= Class.forName("com.app.kk.desionpattern.MySingleton");
		Constructor<MySingleton> cons=clzz.getDeclaredConstructor();
		cons.setAccessible(true);
		MySingleton s3=  cons.newInstance();
		print("consNewIns s3", s3);//2018699554  here we have voilate the singleton 
		//---------------------------------------
		// we are violating  singleton using serialization and de-serialization  
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.text"));
		oos.writeObject(s1);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.text"));
		MySingleton s4=(MySingleton)ois.readObject();
		print("s4 --> desrialization ", s4);
		//--------------------
		// now trying with cloning 
		MySingleton s5=(MySingleton) s1.clone();
		
		print("s5 ---> cloning s1",s5);
		//--------------------
		
	}
	
	static void print(String name,MySingleton obj) {
		System.out.println(String.format("%s : %d ", name,obj.hashCode()));
	}
	static void print(String name,Singleton obj) {
		System.out.println(String.format("%s : %d ", name,obj.hashCode()));
	}
}