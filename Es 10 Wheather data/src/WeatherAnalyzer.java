import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class WeatherAnalyzer {
    public static void main(String[] args) {
        List<WeatherData> weatherData = Arrays.asList(
                new WeatherData("Roma", LocalDate.of(2024, 1, 15), 8.5, 12.0, 75),
                new WeatherData("Milano", LocalDate.of(2024, 1, 15), 2.0, 5.5, 80),
                new WeatherData("Roma", LocalDate.of(2024, 7, 20), 32.5, 0.0, 45),
                new WeatherData("Milano", LocalDate.of(2024, 7, 20), 29.0, 2.5, 55),
                new WeatherData("Napoli", LocalDate.of(2024, 1, 15), 12.0, 8.0, 70),
                new WeatherData("Napoli", LocalDate.of(2024, 7, 20), 35.0, 0.5, 40),
                new WeatherData("Torino", LocalDate.of(2024, 1, 15), -1.0, 15.0, 85),
                new WeatherData("Torino", LocalDate.of(2024, 7, 20), 28.5, 10.0, 60),
                new WeatherData("Roma", LocalDate.of(2024, 4, 10), 18.0, 3.0, 65),
                new WeatherData("Milano", LocalDate.of(2024, 4, 10), 15.5, 8.0, 70)
        );
        weatherData.stream().filter(n -> n.getTemp()>25).sorted().forEach(
                System.out::println);

        System.out.println("\n");
        weatherData.stream().sorted(Comparator.comparing(WeatherData::getTemp).reversed()).forEach(System.out::println);

        System.out.println("\n");
        List<String> map = weatherData.stream().filter(n -> n.getPrecipitation()>10).map(WeatherData::getCity).collect(Collectors.toList());
        System.out.println(map);

        System.out.println("\n");
        weatherData.stream().max(Comparator.comparing(WeatherData::getTemp)).ifPresent(System.out::println);
        weatherData.stream().min(Comparator.comparing(WeatherData::getTemp)).ifPresent(System.out::println);

        System.out.println("\n");
        weatherData.stream().filter(n -> n.getHumidity()>50).sorted().forEach(System.out::println);
    }
}
