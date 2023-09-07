package observer;

public class StatisticsDisplay implements DisplayElement,Observer{


    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private WeatherData weatherData;
    private int numReadings;



    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }



    @Override
    public void update() {
        float temp = weatherData.getTemp();
        tempSum += temp;
        numReadings++;

        if(temp> maxTemp){
            maxTemp = temp;
        }

        if(temp < minTemp){
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
