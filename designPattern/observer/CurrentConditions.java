package zdk.observer;

public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;

    @Override
    public void update(float temperature,float pressure){
        this.temperature=temperature;
        this.pressure=pressure;
        System.out.println(temperature);
        System.out.println(pressure);
    }
}
