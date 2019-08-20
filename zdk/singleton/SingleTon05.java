package zdk.singleton;
/**
 * 作者：zdk
 * 描述：懒汉式（线程安全，同步代码块）
 * 时间: 2019/8/11 8:58
*/
public class SingleTon05 {
    private static SingleTon05 instance;

    private SingleTon05(){}

    public static SingleTon05 getInstance(){
        if (instance==null){
            synchronized (SingleTon05.class){
                instance=new SingleTon05();
            }
        }
        return instance;
    }
}
