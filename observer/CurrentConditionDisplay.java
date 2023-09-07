package observer;

public class CurrentConditionDisplay implements DisplayElement,Observer {

    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;


    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.temp = weatherData.getTemp();
        display();
    }

    @Override
    public void display() {
        System.out.println("Temp: " + temp + " humidity: "+ humidity);
    }
}
