package zdk.singleton;
/**
 * 作者：zdk
 * 描述：懒汉式（线程安全，同步方法）
 * 时间: 2019/8/10 17:09
*/
public class SingleTon04 {
    private static SingleTon04 instacne;

    private SingleTon04(){}

    //提供一个静态的共有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized SingleTon04 getInstance(){
        if (instacne==null){
            instacne=new SingleTon04();
        }
        return instacne;
    }
}
