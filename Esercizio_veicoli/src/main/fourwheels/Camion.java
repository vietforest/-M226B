package main.fourwheels;
import main.Veicolo;

public class Camion extends Veicolo {
    private int capacita_massima_di_carico;

    public Camion(String targa, String marca, String modello, int posti, int capacita_massima_di_carico) {
        super(targa, marca, modello, posti);
    }

    public int getCapacita_massima_di_carico() {
        return capacita_massima_di_carico;
    }

    public void setCapacita_massima_di_carico(int capacita_massima_di_carico) {
        this.capacita_massima_di_carico = capacita_massima_di_carico;
    }

    @Override
    public void faiRumore() {

    }
}
