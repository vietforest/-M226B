import java.util.concurrent.atomic.AtomicInteger;

public class Esercizio15c {


    static class BankAccount {
        private AtomicInteger saldo;

        public BankAccount(int saldoIniziale) {
            saldo = new AtomicInteger(saldoIniziale);
        }


        public void preleva(int importo) {

            int saldoAttuale;
            do {
                saldoAttuale = saldo.get();
                if (saldoAttuale >= importo) {

                    if (saldo.compareAndSet(saldoAttuale, saldoAttuale - importo)) {
                        System.out.println(Thread.currentThread().getName() + " ha prelevato " + importo + ". Saldo: " + saldo.get());
                        return;
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " ha tentato di prelevare " + importo + " ma il saldo è insufficiente.");
                    return;
                }
            } while (true);
        }


        public void versa(int importo) {

            int saldoAttuale = saldo.get();
            saldo.set(saldoAttuale + importo);
            System.out.println(Thread.currentThread().getName() + " ha versato " + importo + ". Saldo: " + saldo.get());
        }


        public int getSaldo() {
            return saldo.get();
        }
    }

    public static void main(String[] args) {

        Esercizio15b.BankAccount conto = new Esercizio15b.BankAccount(200);


        int numeroDiThread = 5;
        Thread[] threads = new Thread[numeroDiThread];


        for (int i = 0; i < numeroDiThread; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    int importo = (int) (Math.random() * 100);
                    if (Math.random() > 0.5) {
                        conto.versa(importo);
                    } else {
                        conto.preleva(importo);
                    }
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < numeroDiThread; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
