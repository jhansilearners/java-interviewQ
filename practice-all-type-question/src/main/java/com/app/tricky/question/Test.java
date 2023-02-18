package com.app.tricky.question;

class Test {
	public static void main(String[] args) {
		Test p = new Test();
		p.start();
	}
	StringBuilder data=new StringBuilder("test");
	Boolean b1 = true;
	int i=10;
	int z=9;
	void start() {
		
		boolean b2=false;
		//boolean b2 = fix(b1);
		    
		System.out.println(b1 + " " + data+" i="+i+" z="+z);
		fix2(b1,data,i);
		System.out.println(b1 + " " + data+" i="+i+" z="+z);
		
	}

	boolean fix(boolean b1) {
		b1 = true;
		return b1;
	}
	void fix2(Boolean b1,StringBuilder data,int i) {
		data.append("updated_data");
		b1=false;
		i=4;
		z=80;
	}
}
