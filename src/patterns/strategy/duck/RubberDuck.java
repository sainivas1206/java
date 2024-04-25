package patterns.strategy.duck;

import patterns.strategy.fly.FlyWithNoWings;
import patterns.strategy.quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super.flyBehaviour = new FlyWithNoWings();
		super.quackBehaviour = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("RubberDuck :: display");
	}
	
	
//	@Override
//	public void quack() {
//		System.out.println("RubberDuck :: Squeak");
//	}

}
