package zdk.decorator;
/**
 * 作者：zdk
 * 描述：装饰者模式
 * 时间: 2019/8/13 18:02
*/
public class Client {
    public static void main(String[] args) {
        Drink order=new LongBlack();
        //加入一份牛奶
        order=new Milk(order);
        //加入一份巧克力
        order=new Chocolate(order);
        System.out.println(order.getDse());
        System.out.println(order.cost());
    }
}
