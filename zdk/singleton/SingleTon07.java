package zdk.singleton;
/**
 * 作者：zdk
 * 描述：静态内部类
 * 时间: 2019/8/11 9:31
*/
public class SingleTon07 {

    private SingleTon07(){}

    private static class SingletonInstance{
        private static final SingleTon07 INSTANCE=new SingleTon07();
    }

    public static SingleTon07 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
