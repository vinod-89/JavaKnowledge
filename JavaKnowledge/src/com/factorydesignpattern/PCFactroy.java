package com.factorydesignpattern;

public class PCFactroy {
public static Computer getComputer(String type,String cpu,String ram,String hdd) {
	if("PC".equalsIgnoreCase(type)) {
		return new PC(cpu,ram,hdd);
	}
	
	return null;
	
}
}
