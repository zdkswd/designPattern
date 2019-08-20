package zdk.adapter.classadapter;
/**
 * 作者：zdk
 * 描述：类适配器模式
 * 时间: 2019/8/12 18:53
*/
public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charging(new VoltageAdapter());
    }
}
