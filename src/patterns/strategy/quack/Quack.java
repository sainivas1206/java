package patterns.strategy.quack;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("QuackBehaviour :: Quack");
	}

}
