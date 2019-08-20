package zdk.proxy.staticproxy;
/**
 * 作者：zdk
 * 描述：静态代理
 * 时间: 2019/8/16 15:02
*/
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao=new TeacherDao();

        //创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy=new TeacherDaoProxy(teacherDao);

        //通过代理对象，调用被代理对象的方法
        teacherDaoProxy.teach();
    }
}
