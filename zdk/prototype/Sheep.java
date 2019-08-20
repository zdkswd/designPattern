package zdk.prototype;
/**
 * 作者：zdk
 * 描述：原型模式
 * 继承Cloneable接口，重写clone()
 * 时间: 2019/8/11 21:23
*/
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;


    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        Sheep sheep=null;
        try{
            sheep=(Sheep)super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
