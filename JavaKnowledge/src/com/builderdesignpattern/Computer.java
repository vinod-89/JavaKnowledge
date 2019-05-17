package com.builderdesignpattern;

public class Computer {
	private String hdd;
	private String ram;

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	private Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
	}

	public static class ComputerBuilder {

		public String hdd;
		public String ram;
		
		public ComputerBuilder(String hdd,String ram) {
			this.hdd=hdd;
			this.ram=ram;
		}
		public	Computer build() {
				return new Computer(this);
			}
		}

	}


