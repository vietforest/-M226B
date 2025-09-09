package main.fourwheels;

import main.interfaces.VeicoloElettrico;

public class AutoElettrica extends Auto implements VeicoloElettrico {
    private int autonomiaBatteria;

    public AutoElettrica(String targa, String marca, String modello, int posti, int numero_di_porte, int autonomiaBatteria) {
        super(targa, marca, modello, posti, numero_di_porte);
        if (autonomiaBatteria > 0 && autonomiaBatteria <= 100) {
            this.autonomiaBatteria = autonomiaBatteria;
        } else {
            throw new IllegalArgumentException("autonomiaBatteria must be between 0 and 100");
        }

    }

    public void setAutonomiaBatteria(int autonomiaBatteria) {
        this.autonomiaBatteria = autonomiaBatteria;
    }

    @Override
    public double getAutonomiaBatteria() {
        return autonomiaBatteria;
    }

    @Override
    public void ricarica() {
        // Count down to 0 and print it on the console
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        setAutonomiaBatteria(100);
        System.out.printf("Autonomia batteria: %d\n", autonomiaBatteria);
    }
}
