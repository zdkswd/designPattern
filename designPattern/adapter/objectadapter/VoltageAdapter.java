package zdk.adapter.objectadapter;

//适配器类
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;//关联关系为聚合关系

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        //获取220V电压
        int src=voltage220V.output220V();
        int dst=src/44;
        return dst;
    }
}
