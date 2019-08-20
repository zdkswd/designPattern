package zdk.facade;

public class DVDPlayer {
    //使用单例模式，使用饿汉式
    private static DVDPlayer instance=new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    private DVDPlayer() {
    }

    public void on(){
        System.out.println("打开DVD");
    }

    public void off(){
        System.out.println("关闭DVD");
    }
}
