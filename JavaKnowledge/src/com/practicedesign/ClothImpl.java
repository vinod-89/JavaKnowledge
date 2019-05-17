package com.practicedesign;

public class ClothImpl implements Cloth {
	String clothDetails;
	String getPrice;
	String getStore;

	public  ClothImpl(String clothDetails,String getPrice, String getStore) {
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
