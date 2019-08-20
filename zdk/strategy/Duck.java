package zdk.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public Duck(){

    }

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子游泳");
    }

    public void fly(){
        if (flyBehavior!=null){
            flyBehavior.fly();
        }
    }
}
