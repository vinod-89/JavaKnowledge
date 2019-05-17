package com.practicedesign;

public class ClothFactory {

	public static Cloth getFactoryCloth(String details, String price, String store) {
		{
			return new ClothImpl(details, price, store);
		}

	}

}
