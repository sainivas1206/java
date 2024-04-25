package patterns.strategy.fly;

public class RocketPower implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("RocketPower :: fly with rocket power");
    }

}
