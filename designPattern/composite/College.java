package zdk.composite;

import java.util.ArrayList;
import java.util.List;

//College就是Composite,可以管理Department.
public class College extends OrganizationComponent{

    //就是输出College包含的Department
    @Override
    protected void print() {
        System.out.println(getName());
        for (OrganizationComponent component:organizationComponents){
            component.print();
        }
    }
    private List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
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
