package patterns.strategy.fly;

public class FlyWithNoWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("FlyWithNoWings :: I can't fly");
	}

}
