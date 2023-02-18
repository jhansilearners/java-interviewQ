package com.app.generics;

public class Tray {
	public <T> void add(Glass<T> glass) {
		System.out.println("class contains type argument as T");
		glass.getOper(new String());
	}
    public static void main(String[] args) {
		Tray tray=new Tray();
		Glass<Juice> juice=new Glass<>();
		tray.add(juice);
		Glass<OrangeJuice> orangeJuice=new Glass<>();
		tray.add(orangeJuice);
		
		
		System.out.println();
	}
}
