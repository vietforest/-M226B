package main.service;

import main.interfaces.Riparabile;

import java.util.ArrayList;
import java.util.List;

public class Officina implements Riparabile {
    List<Riparabile> veicoliInRiparazione = new ArrayList<Riparabile>();

    public Officina() {};

    public void accettaVeicolo(Riparabile veicolo){
        veicoliInRiparazione.add(veicolo);
    }
    public void stampaSchedarioRiparazioni(){
        for (Riparabile i : veicoliInRiparazione){
            System.out.println("Veicolo: " + i.toString());
            System.out.println("Costo riparazione stimato (2 ore): $"
            + i.calcolaCostoRiparazione(2));
        }
    }


    @Override
    public double calcolaCostoRiparazione(int oreLavoro) {
        return 200 * oreLavoro;
    }
}
