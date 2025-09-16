package main.service;

import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;

import java.util.HashSet;
import java.util.Set;

public class AgenziaAssicurativa {
    Set<Assicurabile> veicoliAssicurati =  new HashSet<>();

    public void accettaVeicolo(Assicurabile veicolo){
        veicoliAssicurati.add(veicolo);
    }
    public void calcolaIncassoTotale(){
        for (Assicurabile i : veicoliAssicurati){
            System.out.println("Veicolo: " + i.toString());
            System.out.println("Costo riparazione stimato (2 ore): $"
                    + i.getCostoAssicurazione());
        }
    }
}
