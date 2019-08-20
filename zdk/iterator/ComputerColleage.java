package zdk.iterator;

import java.util.Iterator;

public class ComputerColleage implements Colleage{
    Department[] departments;
    int numOfDepartment=0;

    public ComputerColleage() {
        departments=new Department[5];
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department=new Department(name,desc);
        departments[numOfDepartment]=department;
        numOfDepartment+=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
