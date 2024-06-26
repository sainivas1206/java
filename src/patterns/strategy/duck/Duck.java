package patterns.strategy.duck;

import patterns.strategy.fly.FlyBehaviour;
import patterns.strategy.quack.QuackBehaviour;

public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	
	QuackBehaviour quackBehaviour;
	
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
//	public void fly() {
//		System.out.println("Duck :: fly");
//	}
//	
//	public void quack() {
//		System.out.println("Duck :: Quack");
//	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();

}
