package com.app.generics;

public class Guiest {
	public static void main(String[] args) {
		Glass<Juice> juiceGlass=new Glass<>();
		juiceGlass.liquid=new Juice();
		
		Glass<Water> waterGlass=new Glass<>();
		waterGlass.liquid=new Water();
		
		// so here we can hold the multiple type of liquid in glass object 
	    
		// there is also one thing we will get 
		Glass<Liquid> liqGlass=new Glass<>(); 
		liqGlass.liquid=new Water();
		
		String test=liqGlass.liquid.getTest();
		System.out.println(test==null?"No test":test);
		
		// wild card importance 
		Glass<Bins> binsGlass=new Glass<>();
		binsGlass.liquid=new Bins();// this is allow here but it should not allow when if we want to allow only liquid type then we have to use wild card of liquid type
		//binsGlass.liquid.getTest(); this thing we can avoid using wild cards ce
		
		
		// if we are trying to pass type parameter other then Liquid type then we will get ce:
	//	GlassLiquidType<Cake> isNotLiquidType=new GlassLiquidType<>();//Bound mismatch: The type Cake is not a valid substitute for the bounded parameter <T extends Liquid> of the type GlassLiquidType<T>
		
		GlassLiquidType<OrangeJuice> orangeJuice=new GlassLiquidType<>();// it is ok 
		
		
	}

}
