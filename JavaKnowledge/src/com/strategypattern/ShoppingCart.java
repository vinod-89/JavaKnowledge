package com.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public int calculateTotal() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public int wallet() {
		final int default1 = 50;
		int amt = calculateTotal();
		return amt + default1;
	}

	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);

	}

	public void wallet(WalletStrategy paymentMethod) {
		int amount = wallet();
		paymentMethod.topUpWallet(items.get(0).getUpcCode(), amount);
		;

	}

}
