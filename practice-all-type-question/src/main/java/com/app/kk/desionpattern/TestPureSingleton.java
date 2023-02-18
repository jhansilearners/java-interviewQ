package com.app.kk.desionpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPureSingleton {
	
	public static void jobToGetInstance() {
		PureSingleton ps=PureSingleton.getInstance();
		print("thread ps :", ps);
	}
	public static void main(String[] args)throws Exception  {
		//preventByRefelection();
		//bySerializationAndDeserialization();
		//byClone();
		// by multithreading
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		executorService.submit(TestPureSingleton::jobToGetInstance);
		executorService.submit(TestPureSingleton::jobToGetInstance);
	
		
		executorService.shutdown();
		
		
	}
	private static void byClone() throws CloneNotSupportedException {
		PureSingleton ps=PureSingleton.getInstance();
		print("ps", ps);
		PureSingleton psc=(PureSingleton)ps.clone();
		print("ps", psc);
	}
	private static void bySerializationAndDeserialization()
			throws IOException, FileNotFoundException, ClassNotFoundException {
		
		PureSingleton ps=PureSingleton.getInstance();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.text"));
		oos.writeObject(ps);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.text"));
		PureSingleton ps1=(PureSingleton)ois.readObject();
		print("ps", ps);
        print("ps1", ps1);
	}
	private static void preventByRefelection() throws ClassNotFoundException, NoSuchMethodException,
			InstantiationException, IllegalAccessException, InvocationTargetException {
		//PureSingleton ps=PureSingleton.getInstance();
		// print("ps", ps);
		
		// for reflection we can avoid creating new object using newInstance method of constructor 
		Class clzz=Class.forName("com.app.kk.desionpattern.PureSingleton");
		Constructor<PureSingleton> consSingleton=clzz.getDeclaredConstructor();
		consSingleton.setAccessible(true);
		PureSingleton pSingleton=consSingleton.newInstance();
		PureSingleton pSingleton2=consSingleton.newInstance();
		print("ref_s1", pSingleton);
		print("ref_s2", pSingleton2);
	}
	static void print(String name,PureSingleton obj) {
		System.out.println(String.format("%s : %d ", name,obj.hashCode()));
	}
}
