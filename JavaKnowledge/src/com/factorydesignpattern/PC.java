package com.factorydesignpattern;

public class PC implements Computer{
private String cpu;
private String ram;
private String hdd;

public PC(String cpu,String ram,String hdd) {
	this.cpu=cpu;
	this.ram=ram;
	this.hdd=hdd;
}
	
	
	@Override
	public String getCpu() {
	return  "cpu hards="+cpu;
	}

	@Override
	public String getRam() {
		
		return "ram ddr-="+ram;
	}

	@Override
	public String getHdd() {
		return "hdd ddr-1 or ddr2="+hdd;
	}
	

}
