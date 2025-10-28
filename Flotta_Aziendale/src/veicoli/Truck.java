package veicoli;

import enums.Carburante;
import interfaces.GPS;

public class Truck extends Veicolo implements GPS {

    public Truck(String nome, Carburante carburante, double distanza) {
        super(nome, carburante, distanza);
    }

    @Override
    public String setDestination(String destination) {
        return destination;
    }

    @Override
    public double setCostPerDistance(double distance) {
        return distance * 2;
    }
}
