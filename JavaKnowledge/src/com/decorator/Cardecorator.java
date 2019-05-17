package com.decorator;

public class Cardecorator  implements Car{
	protected Car c;
	
	public Cardecorator(Car c) {
		this.c=c;
	}

	@Override
	public void assemble() {
	this.c.assemble();
		
	}

}
