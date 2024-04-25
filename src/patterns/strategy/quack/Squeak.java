package patterns.strategy.quack;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("QuackBehaviour :: Squeak");
	}

}
