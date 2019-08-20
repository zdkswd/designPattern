package zdk.facade;

public class HomeThreaterFacade {
    //定义各个子系统对象
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;

    public HomeThreaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    //操作
    public void open(){
        dvdPlayer.on();
        projector.on();
        screen.on();
    }

    public void close(){
        screen.off();
        projector.off();
        dvdPlayer.off();
    }

}
