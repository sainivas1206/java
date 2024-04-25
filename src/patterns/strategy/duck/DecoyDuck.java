package patterns.strategy.duck;

import patterns.strategy.fly.FlyWithNoWings;
import patterns.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super.flyBehaviour = new FlyWithNoWings();
		super.quackBehaviour = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("WoodenDuck :: display");
	}

}
