package zdk.facade;

public class Projector {
    //使用单例模式，使用饿汉式
    private static Projector instance=new Projector();

    public static Projector getInstance(){
        return instance;
    }

    private Projector() {
    }

    public void on(){
        System.out.println("打开投影仪");
    }

    public void off(){
        System.out.println("关闭投影仪");
    }
}
