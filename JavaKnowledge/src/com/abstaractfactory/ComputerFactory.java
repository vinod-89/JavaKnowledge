package com.abstaractfactory;

public class ComputerFactory {
	public static Computer getComputer(PCfactory factory){
		return factory.createComputer();
	}
}
