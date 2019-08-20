package zdk.strategy;

public class WildDuck extends Duck{
    //构造器，传入FlyBehavior对象
    public WildDuck() {
        flyBehavior=new GoodFlyBehavior();
    }
}
