package zdk.strategy;


/**
 * 作者：zdk
 * 描述：策略模式
 * 通过组合实现对象不同的行为
 * 时间: 2019/8/20 16:00
*/
public class Client {
    public static void main(String[] args) {
        //通过构造器来实现了默认行为
        WildDuck wildDuck=new WildDuck();
        wildDuck.fly();

        //也动态改变某个对象行为
        wildDuck.setFlyBehavior(new NoFlyBehavior());
        wildDuck.fly();
    }
}
