import enums.Carburante;
import interfaces.GPS;
import veicoli.Car;
import veicoli.Truck;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", Carburante.DIESEL, 500);
        Truck truck = new Truck("Toyota", Carburante.GASOLINE, 900);
        HashSet<GPS> gpsSet = new HashSet<>();
        gpsSet.add(car);
        gpsSet.add(truck);

        for (GPS gps : gpsSet) {
            System.out.println(gps.+"has been assigned to destination: "+ gps.setDestination("City center"));
            car.startVehicle();
            System.out.println(gps.getClass().getName()+ "fuel cost for " + car.getDistanza() + "km: " + gps.setCostPerDistance(gps.getClass().getDi));
            System.out.print("Arrived at destination. Total km traveled: " + gps.getDistanza() + "Km\n");
            System.out.println(gps.stopVehicle());
        }

    }
}