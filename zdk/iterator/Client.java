package zdk.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Colleage> colleages=new ArrayList<>();
        ComputerColleage c=new ComputerColleage();
        colleages.add(c);
        OutPutImpl outPut=new OutPutImpl(colleages);
        outPut.printColleage();
    }
}
