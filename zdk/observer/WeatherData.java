package zdk.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    private ArrayList<Observer> observers;

    public WeatherData() {
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)){
            observers.remove(o);
        }
    }

    //遍历所有观察者，并通知
    @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++){
            observers.get(i).update(getTemperature(),getPressure());
        }
    }

    public void dataChange(){
        notifyObservers();
    }

    //当数据有更新时，就调用setData
    public void setData(float temperature,float pressure){
        this.temperature=temperature;
        this.pressure=pressure;
        dataChange();
    }
}
