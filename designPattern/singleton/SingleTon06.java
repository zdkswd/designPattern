package zdk.singleton;
/**
 * 作者：zdk
 * 描述：双重检查
 * 时间: 2019/8/11 9:06
*/
public class SingleTon06 {
    private static volatile SingleTon06 instance;

    private SingleTon06(){}

    public static SingleTon06 getInstance(){
        if(instance==null){
            synchronized (SingleTon06.class){
                if (instance==null){
                    instance=new SingleTon06();
                }
            }
        }
        return instance;
    }
}
