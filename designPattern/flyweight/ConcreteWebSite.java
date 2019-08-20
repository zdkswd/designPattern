package zdk.flyweight;

public class ConcreteWebSite extends WebSite{
    private String type="";//网站发布形式（类型）

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为"+type+user.getName());
    }

    public ConcreteWebSite(String type) {
        this.type = type;
    }
}
