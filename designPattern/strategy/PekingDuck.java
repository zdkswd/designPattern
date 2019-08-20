package zdk.strategy;

public class PekingDuck extends Duck{
    public PekingDuck() {
        flyBehavior=new NoFlyBehavior();
    }
}
