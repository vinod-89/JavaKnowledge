package com.abstaractfactory;

public class PC implements Computer {
	public String  cpu;
	public String  ram;
	public String  hdd;
	
	public PC(String cpu, String ram,String hdd) {
		this.cpu=cpu;
		this.ram=ram;
		this.hdd=hdd; 
	}

	@Override
	public String getCpu() {
		
		return cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return hdd;
	}

}
