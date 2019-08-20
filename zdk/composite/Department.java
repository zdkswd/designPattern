package zdk.composite;

import java.util.ArrayList;
import java.util.List;

//Department.叶子节点
public class Department extends OrganizationComponent{

    @Override
    protected void print() {
        System.out.println(getName());
    }

    public Department(String name, String des) {
        super(name, des);
    }

}
