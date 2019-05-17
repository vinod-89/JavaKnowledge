package com.abstaractfactory;

public class Factory {
	public static void main(String args[]) {
		Computer c=ComputerFactory.getComputer(new PCfactory("2 GB","500 GB","2.4 GHz"));
		System.out.println("scvsd " +c.getCpu()+"csa "+c.getRam());
	
	}
}
