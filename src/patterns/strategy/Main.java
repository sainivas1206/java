package patterns.strategy;

import patterns.strategy.duck.Duck;
import patterns.strategy.duck.MallardDuck;
import patterns.strategy.duck.SuperDuck;
import patterns.strategy.fly.RocketPower;

public class Main {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();

		System.out.println("==============================");
		
		Duck superDuck = new SuperDuck();
		superDuck.performFly();
		superDuck.performQuack();
		superDuck.display();
		superDuck.setFlyBehaviour(new RocketPower());
		superDuck.performFly();

	}
}
