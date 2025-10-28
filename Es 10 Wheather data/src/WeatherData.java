import java.time.LocalDate;
import java.util.Comparator;

public class WeatherData implements Comparable<WeatherData>{
    private String city;
    private LocalDate date;
    private double temp;
    private double precipitation;
    private double humidity;

    public WeatherData(String city, LocalDate date, double temp, double precipitation, double humidity) {
        this.city = city;
        this.date = date;
        this.temp = temp;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public int compareTo(WeatherData o) {
        return o.getCity().compareTo(this.city);
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", date=" + date +
                ", temp=" + temp +
                ", precipitation=" + precipitation +
                ", humidity=" + humidity +
                '}';
    }


}
