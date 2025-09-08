package main;

import java.util.Objects;

public abstract class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int posti;

    public Veicolo(String targa, String marca, String modello, int posti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.posti = posti;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    // Override faiRumore() with different sound
    public abstract void faiRumore();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return posti == veicolo.posti && Objects.equals(targa, veicolo.targa) && Objects.equals(marca, veicolo.marca) && Objects.equals(modello, veicolo.modello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targa, marca, modello, posti);
    }
}
