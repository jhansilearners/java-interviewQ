package com.app.google.interviewQ;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		throw new Error();
	}
}


// Output of the above code is 

//CException in thread "main" java.lang.Error
//at com.app.google.interviewQ.ExceptionTest.badMethod(ExceptionTest.java:18)
//at com.app.google.interviewQ.ExceptionTest.main(ExceptionTest.java:7)
