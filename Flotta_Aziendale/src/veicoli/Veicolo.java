package veicoli;

import enums.Carburante;
import interfaces.GPS;

public abstract class Veicolo implements GPS {
    private String nome;
    private Carburante carburante;
    private double distanza;

    public Veicolo(String nome, Carburante carburante, double distanza) {
        this.nome = nome;
        this.carburante = carburante;
        this.distanza = distanza;
    }

    public Carburante getCarburante() {
        return carburante;
    }

    public void setCarburante(Carburante carburante) {
        this.carburante = carburante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDistanza() {
        return distanza;
    }

    public void setDistanza(double distanza) {
        this.distanza = distanza;
    }

    @Override
    public void startVehicle() {
        System.out.println("Status: Vehicle is in motion.");
    }

    @Override
    public String stopVehicle() {
        return "Status: Vehicle is stationary.";
    }

    @Override
    public String setDestination(String destination) {
        return destination;
    }

    @Override
    public String toString() {
        return "Honda Civic "has been assigned to destination: " +
        Status: Vehicle is in motion.
        Car Honda Civic fuel cost for 500,00 km: $90,00
        Arrived at destination. Total km traveled: 500,00 km.
                Status: Vehicle is stationary.

    }
}
