package zdk.template;
/**
 * 作者：zdk
 * 描述：模板方法模式
 * 时间: 2019/8/17 9:52
*/
public class Client {
    public static void main(String[] args) {
        SoyaMilk red=new RedBeanSoyaMilk();
        red.make();

        SoyaMilk peanut=new PeanutSoyaMilk();
        peanut.make();

        SoyaMilk pure=new PureSoyaMilk();
        pure.make();
    }
}
