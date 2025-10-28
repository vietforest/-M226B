package veicoli;

import enums.Carburante;
import interfaces.GPS;

public class Van extends Veicolo implements GPS {

    public Van(String nome, Carburante carburante, double distanza) {
        super(nome, carburante, distanza);
    }

    @Override
    public String setDestination(String destination) {
        return destination;
    }

    @Override
    public double setCostPerDistance(double distance) {
        return 0;
    }
}
