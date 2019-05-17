package com.decorator;

public class SportCar extends Cardecorator {

	public SportCar(Car c) {
		super(c);
	}
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}

}
