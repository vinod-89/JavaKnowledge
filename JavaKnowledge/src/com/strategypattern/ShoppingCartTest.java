package com.strategypattern;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(new Item("1234", 10));
		cart.addItem(new Item("12345", 20));

		// pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		//cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

		// pay by credit card
		cart.pay(new CreditCard("Pankaj Kumar", "1234567890123456", "786", "12/15"));
		
		cart.wallet(new CreditCard("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
}