package patterns.strategy;

import patterns.strategy.duck.Duck;
import patterns.strategy.duck.MallardDuck;

public class Main {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
