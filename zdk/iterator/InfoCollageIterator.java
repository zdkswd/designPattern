package zdk.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollageIterator implements Iterator {

    List<Department> departmentList;//以List方式存放
    int index=-1;

    public InfoCollageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index>=departmentList.size()-1){
            return false;
        }else {
            index+=1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
