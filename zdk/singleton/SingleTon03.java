package zdk.singleton;
/**
 * 作者：zdk
 * 描述：懒汉式（线程不安全）
 * 时间: 2019/8/10 17:00
*/
public class SingleTon03 {
    private static SingleTon03 instacne;

    private SingleTon03(){}

    public static SingleTon03 getInstance(){
        if (instacne==null){
            instacne=new SingleTon03();
        }
        return instacne;
    }
}
