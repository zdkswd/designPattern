package zdk.flyweight;
/**
 * 作者：zdk
 * 描述：享元模式
 * 时间: 2019/8/16 10:10
*/
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory=new WebSiteFactory();

        //客户要一个新闻形式发布的网站
        WebSite webSite1=webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));

        WebSite webSite2=webSiteFactory.getWebSiteCategory("新闻");
        webSite2.use(new User("jack"));

        System.out.println(webSiteFactory.getWebSiteCount());
        System.out.println(webSite1==webSite2);
    }
}
