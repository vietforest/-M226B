package main.twowheels;

import main.Main;
import main.Veicolo;
import main.interfaces.Assicurabile;
import mechanics.Motore;

import java.util.Objects;

public final class Moto extends Veicolo implements Assicurabile {
    private String tipo;
    private Motore motore;

    public Moto(String targa, String marca, String modello, int numeroPosti, String tipo, Motore motore) {
        super(targa, marca, modello, numeroPosti);
        this.motore = motore;
        this.tipo = tipo;
    }
    public Moto(String targa, String marca, String modello, int numeroPosti, String tipo) {
        super(targa, marca, modello, numeroPosti);
        this.tipo = tipo;
    }


    // Override faiRumore() with different sound
    @Override
    public void faiRumore() {
        System.out.println("Broooom broooom!");
    }


    public Motore getMotore() {
        return motore;
    }

    public void setMotore(Motore motore) {
        this.motore = motore;
    }

    // Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(tipo, moto.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "targa='" + getTarga() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                ", numeroPosti=" + getPosti() +
                ", tipo='" + tipo + '\'' +
                ", motore=" + getMotore() +
                '}';
    }


    @Override
    public final double getCostoAssicurazione() {
        return 250;
    }
}