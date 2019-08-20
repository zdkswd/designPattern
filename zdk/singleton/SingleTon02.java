package zdk.singleton;
/**
 * 作者：zdk
 * 描述：饿汉式（静态代码块）
 *
 * 时间: 2019/8/10 16:42
*/
public class SingleTon02 {

    private static SingleTon02 instance;

    static {
        instance=new SingleTon02();
    }

    private SingleTon02(){}

    public static SingleTon02 getInstance(){
        return instance;
    }

}
