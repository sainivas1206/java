package patterns.strategy.duck;

import patterns.strategy.fly.FlyWithNoWings;
import patterns.strategy.quack.MuteQuack;

public class SuperDuck extends Duck{

    public SuperDuck(){
        super.flyBehaviour = new FlyWithNoWings();
        super.quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("SuperDuck :: display super powered duck");
    }

}
