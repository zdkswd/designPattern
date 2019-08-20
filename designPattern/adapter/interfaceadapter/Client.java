package zdk.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        new AbsAdapter(){
            //只需去覆盖我们需要使用的接口方法
            @Override
            public void m1() {
                System.out.println("m1");
            }
        };
    }
}
