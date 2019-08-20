package zdk.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

   //这里需要Department是以怎样方式存放=>数组
    Department[] departments;
    int position=0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (position>=departments.length||departments[position]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department=departments[position];
        position+=1;
        return department;
    }

    @Override
    public void remove() {

    }
}
