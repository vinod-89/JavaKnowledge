package com.strategypattern.fighter;

public class UnderTacker implements Fighter {
	private Kicker kicker;
	private Jumper jumber;
	
	public UnderTacker(Kicker kicker, Jumper jumber) {
		super();
		this.kicker = kicker;
		this.jumber = jumber;
	}

	@Override
	public void fight() {
		System.out.println("UnderTracker, Dead Man");

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
