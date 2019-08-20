package zdk.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent u=new University("清华","大学");
        OrganizationComponent c=new College("计算机","学院");
        OrganizationComponent d=new Department("计算机科学","系");
        c.add(d);
        u.add(c);
        u.print();
    }
}
