package main;

import main.fourwheels.Auto;
import main.fourwheels.AutoElettrica;
import main.fourwheels.Camion;
import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;
import main.twowheels.Moto;
import mechanics.Motore;

public class Main {
    public static void main(String[] args) {
        // Create a truck (camion)
        Camion camion = new Camion("AB123CD", "Volvo", "FH16", 2, 40000);

        // Create a motorcycle (moto)
        Moto moto = new Moto("XY789ZW", "Ducati", "Panigale V4", 2, "Sportiva");

        // Set engine data for the motorcycle
        Motore motoreMoto = new Motore("DUC-2024-001", "Desmosedici Stradale");
        moto.setMotore(motoreMoto);

        // Test sounds
        System.out.println("Che rumore fa il camion?");
        camion.faiRumore();

        System.out.println("Che rumore fa la moto?");
        moto.faiRumore();

        // Print vehicle details
        System.out.println("\nDettagli veicoli:");
        System.out.println(camion);
        System.out.println(moto);

        // Test equals method (case insensitive comparison by marca and modello)
        Moto altraMoto = new Moto("QW456ER", "ducati", "panigale v4", 2, "Sport");
        System.out.println("\nLe due moto sono uguali (stesso modello e marca)? " + moto.equals(altraMoto));
        Auto miaAuto = new Auto("AB123CD", "Volvo", "FH16", 2, 4 );

        Moto miaMoto = new Moto("XY729ZW", "Ducati", "Panigale V4", 1, "Sportiva");
        System.out.print(miaAuto.calcolaCostoRiparazione(5));
        System.out.println(miaMoto.getCostoAssicurazione());
















        AutoElettrica autoElettrica = new AutoElettrica("AB123CD", "Volvo", "FH16", 2, 4, 50);
        System.out.printf(String.valueOf(autoElettrica.getAutonomiaBatteria()+"\n"));
        autoElettrica.ricarica();
    }
}