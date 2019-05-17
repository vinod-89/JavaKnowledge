package com.decorator;

public class CarMain {
	public static void main(String[] args) {
		Car sportsCar = new SportCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
	}

}
