package zdk.observer;
/**
 * 作者：zdk
 * 描述：观察者模式
 * 时间: 2019/8/18 20:54
*/
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData=new WeatherData();

        //创建观察者
        CurrentConditions currentConditions=new CurrentConditions();

        //注册到weatherData
        weatherData.registerObserver(currentConditions);

        weatherData.setData(1f,2f);
    }
}
