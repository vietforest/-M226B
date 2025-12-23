public class Esercizio15b {

    // Classe BankAccount che rappresenta un conto bancario
    static class BankAccount {
        private double saldo;

        public BankAccount(double saldoIniziale) {
            saldo = saldoIniziale;
        }

        // Metodo per prelevare denaro dal conto
        public synchronized void preleva(double importo) {
            if (importo <= saldo) {
                saldo -= importo;
                System.out.println(Thread.currentThread().getName() + " ha prelevato " + importo + ". Saldo: " + saldo);
            } else {
                System.out.println(Thread.currentThread().getName() + " ha tentato di prelevare " + importo + " ma il saldo è insufficiente.");
            }
        }

        // Metodo per versare denaro sul conto
        public synchronized void versa(double importo) {
            saldo += importo;
            System.out.println(Thread.currentThread().getName() + " ha versato " + importo + ". Saldo: " + saldo);
        }

        // Metodo per ottenere il saldo attuale
        public synchronized double getSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) {
        // Crea un conto bancario con saldo iniziale di 1000
        BankAccount conto = new BankAccount(-1000);

        // Crea un numero di thread (ad esempio 5 thread)
        int numeroDiThread = 5;
        Thread[] threads = new Thread[numeroDiThread];

        // Avvia i thread, ognuno con un ciclo di prelievi e versamenti
        for (int i = 0; i < numeroDiThread; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        double importo = Math.random() * 100; // Prelievo o versamento casuale
                        if (Math.random() > 0.5) {
                            conto.versa(importo); // Versa denaro
                        } else {
                            conto.preleva(importo); // Preleva denaro
                        }
                    }
                }
            });
            threads[i].start();
        }

        // Attendi che tutti i thread finiscano
        for (int i = 0; i < numeroDiThread; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Mostra il saldo finale
        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
