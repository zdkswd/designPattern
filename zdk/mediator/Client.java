package zdk.mediator;
/**
 * 作者：zdk
 * 描述：中介者模式
 * 时间: 2019/8/19 15:04
*/
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator=new ConcreteMediator();

        //创建Alarm并且加入到ConcreteMediator对象的HashMap
        Alarm alarm=new Alarm(mediator,"alarm");

        TV tv=new TV(mediator,"tv");

        alarm.sendMessage(0);
    }
}
