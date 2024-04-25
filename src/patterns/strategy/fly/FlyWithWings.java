package patterns.strategy.fly;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("FlyWithWings :: I'm flying!!");
	}

}
