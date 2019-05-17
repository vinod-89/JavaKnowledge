package com.abstaractfactory;

public class PCfactory implements AbstatctComputer{

	private String ram;
	private String hdd;
	private String cpu;
	
//	public PCfactory(String string, String string2, String string3) {
//		// TODO Auto-generated constructor stub
//	}
	public  PCfactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}

}
