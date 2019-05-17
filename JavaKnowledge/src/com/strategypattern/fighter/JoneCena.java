package com.strategypattern.fighter;

public class JoneCena implements Fighter {
	private Kicker kicker;
	private Jumper jumber;

	
	@Override
	public void fight() {
		System.out.println("Jone Cena , You can't see me.");

	}

	public JoneCena(Kicker kicker, Jumper jumber) {
		super();
		this.kicker = kicker;
		this.jumber = jumber;
	}

	@Override
	public void kick() {
		kicker.kick();
	}

	@Override
	public void jump() {
		jumber.jump();
	}

}
