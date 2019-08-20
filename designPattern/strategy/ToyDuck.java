package zdk.strategy;

public class ToyDuck extends Duck{
    public ToyDuck() {
        flyBehavior=new NoFlyBehavior();
    }
}
