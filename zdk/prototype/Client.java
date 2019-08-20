package zdk.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep=new Sheep("tom",1,"白色");
        Sheep sheep2=(Sheep)sheep.clone();//克隆
        Sheep sheep3=(Sheep)sheep.clone();//克隆
    }
}
