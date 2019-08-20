package zdk.adapter.classadapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        //获取220V电压
        int src=output220V();
        int dst=src/44;
        return dst;
    }
}
