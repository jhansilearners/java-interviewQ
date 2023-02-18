package com.app.kk.kk.java8;

public class Java9Feature {
	
	
	public static void main(String[] args) {
		// this is the way introduce in java 7 but it is also not good as it has tight
		// coupling used new keyword to create resource
		try(Resource resource=new Resource()){
			resource.doSomething();
		}
		
		//use the resources
		use(new Resource());
		
	}
    private static void use(Resource resource) {
    	// resource=resource; // don't do otherwise compile time erro.
    	// Not here resource is effectively final if we re-assign resource then will get runtime exception
    	/***
    	 * this is not allow up java 8 but in java 9 it is allow. so benefit of this not tightly coupled 
    	 * */
//    	try(resource){
//    		resource.doSomething();
//    	}
    }

}
// this was the old way of  
class Resource implements AutoCloseable{
	public Resource() {
     System.out.println("Resource initialization....");
	}
	public void doSomething() {
		System.out.println("do something ....");
	}
	@Override
	public void close() {
       System.out.println("cleanup resource ....");		
	}
	
}
//Resource initialization....
//do something ....
//cleanup resource ....
