package patterns.strategy.duck;

import patterns.strategy.fly.FlyWithWings;
import patterns.strategy.quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		super.flyBehaviour = new FlyWithWings();
		super.quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("MallardDuck :: display");
	}

}
