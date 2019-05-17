package com.factorydesignpattern;

public class ClientComputer {

	public static void main(String[] args) {
		Computer c=PCFactroy.getComputer("PC", "2ghz", "ddr-1", "pata");
		System.out.println("this is client program "+c.getCpu()+" "+c.getRam()+" "+c.getHdd());
	}

}
