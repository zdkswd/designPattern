package zdk.composite;

import java.util.ArrayList;
import java.util.List;

//University就是Composite,可以管理College.
public class University extends OrganizationComponent{

    //就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println(getName());
        for (OrganizationComponent component:organizationComponents){
            component.print();
        }
    }
    private List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

}
