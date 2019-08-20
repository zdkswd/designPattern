package zdk.singleton;
/**
 * 作者：zdk
 * 描述：枚举
 * 时间: 2019/8/11 9:32
*/
public class SingleTon08 {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.INSTANCE;
        Singleton singleton2=Singleton.INSTANCE;
        System.out.println(singleton1==singleton2);
    }
}
enum Singleton{
    INSTANCE;//属性
    public void method(){
        //方法
    }
}