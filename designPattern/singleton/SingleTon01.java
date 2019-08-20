package zdk.singleton;
/**
 * 作者：zdk
 * 描述：饿汉模式（静态常量）
 * 步骤如下：
 * 1） 构造器私有化（防止new）
 * 2） 类的内部创建对象
 * 3） 向外暴露一个静态的公共方法。getInstance
 * 时间: 2019/8/10 16:27
*/
public class SingleTon01 {
    private SingleTon01(){}

    private final static SingleTon01 instance=new SingleTon01();

    public static SingleTon01 getInstance(){
        return instance;
    }
}
