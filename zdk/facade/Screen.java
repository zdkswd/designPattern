package zdk.facade;

public class Screen {
    //使用单例模式，使用饿汉式
    private static Screen instance=new Screen();

    public static Screen getInstance(){
        return instance;
    }

    private Screen() {
    }

    public void on(){
        System.out.println("打开屏幕");
    }

    public void off(){
        System.out.println("关闭屏幕");
    }
}
