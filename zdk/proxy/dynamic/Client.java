package zdk.proxy.dynamic;

/**
 * 作者：zdk
 * 描述：动态代理
 * 时间: 2019/8/16 15:38
*/
public class Client {
    public static void main(String[] args) {
        //创建一个目标对象
        ITeacherDao target=new TeacherDao();

        //给目标对象创建代理对象,可以转成ITeacherDao,否则没法调用方法
        ITeacherDao proxyInstanc=(ITeacherDao)new ProxyFactory(target).getProxyInstance();

        //class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println(proxyInstanc.getClass());

        //通过代理方法，调用目标对象的方法
        //proxyInstanc.teach();
        proxyInstanc.sayHello("hello");
    }
}
