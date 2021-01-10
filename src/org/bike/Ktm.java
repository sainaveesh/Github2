package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("Price is:1,80,000");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Avg speed:120 km/h");
	}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
}
