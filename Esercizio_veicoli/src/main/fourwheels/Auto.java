package main.fourwheels;
import main.Veicolo;
import main.interfaces.Riparabile;

import java.util.Objects;

public class Auto extends Veicolo implements Riparabile {
    @Override
    public void faiRumore() {

    }

    private int numero_di_porte;

    public Auto(String targa, String marca, String modello, int posti, int numero_di_porte) {
        super(targa, marca, modello, posti);
    }

    public int getNumero_di_porte() {
        return numero_di_porte;
    }

    public void setNumero_di_porte(int numero_di_porte) {
        this.numero_di_porte = numero_di_porte;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return numero_di_porte == auto.numero_di_porte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numero_di_porte);
    }

    @Override
    public double calcolaCostoRiparazione(int oreLavoro) {
        return (oreLavoro * 45.0) + 100;
    }
}
