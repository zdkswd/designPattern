package zdk.iterator;

import java.util.Iterator;

public interface Colleage {
    public String getName();

    public void addDepartment(String name,String desc);

    public Iterator createIterator();
}
