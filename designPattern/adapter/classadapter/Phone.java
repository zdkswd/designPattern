package zdk.adapter.classadapter;

public class Phone {
    //充电
    public void charging(Voltage5V v){
        if (v.output5V()==5){
            System.out.println("输入5V电压");
        }else {
            System.out.println("输入不是5V电压");
        }
    }
}
