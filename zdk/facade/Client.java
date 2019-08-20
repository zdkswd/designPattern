package zdk.facade;
/**
 * 作者：zdk
 * 描述：外观模式
 * 时间: 2019/8/16 9:24
*/
public class Client {
    public static void main(String[] args) {
        HomeThreaterFacade homeThreaterFacade=new HomeThreaterFacade();
        homeThreaterFacade.open();
        homeThreaterFacade.close();
    }
}
