package com.app.kk.desionpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class PureSingleton implements Serializable,Cloneable{
	 private volatile static PureSingleton soleInstance=null;
		private PureSingleton(){
		   // this is used for not invoked newInstance() to create single tone object 
		   if(soleInstance!=null) {
			   throw new RuntimeException("not allow to create object using new instance .");
		   }
		   System.out.println("object created ....");
	   }

		public static PureSingleton getInstance() {
			if (soleInstance == null) {
				synchronized (Singleton.class) {
					if(soleInstance==null) {
						soleInstance = new PureSingleton();
					}
			    }

			}
			System.out.println("inside get instance....");
			return soleInstance;
		}
		// this method is used for avoid different instance while serialization and de serialization 
		private Object readResolve() throws ObjectStreamException{
			System.out.println("read resolved mehtod called ....");
			return soleInstance;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException("we can't clone PureSingleton object");
			
		}
}
