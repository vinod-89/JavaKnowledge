package com.strategypattern.fighter;

public class FighterMain {
public static void main(String args[]) {

	Fighter jonecena= new JoneCena(new ShortKicker(), new LongJumper());
	jonecena.fight();
	jonecena.jump();
	jonecena.kick();
	
	Fighter underTracker= new UnderTacker(new LongKicker(), new LongJumper());
	underTracker.fight();
	underTracker.jump();
	underTracker.kick();
	
}
}