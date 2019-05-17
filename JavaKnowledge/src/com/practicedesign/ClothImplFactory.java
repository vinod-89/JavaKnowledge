package com.practicedesign;

public class ClothImplFactory implements Cloth {
	String clothDetails;
	String getPrice;
	String getStore;

	public  ClothImplFactory(String clothDetails,String getPrice, String getStore) {
		this.clothDetails=clothDetails;
		this.getPrice=getPrice;
		this.getStore=getStore;
	}

	@Override
	public String getDetails() {
	return clothDetails;
		
	}

	@Override
	public String getPrice() {
		return getPrice;
		
	}

	@Override
	public String getStore() {
	return getStore;
		
	}
	

}
