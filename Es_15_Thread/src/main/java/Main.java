import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        try {
            simualteBigFileDownload();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            timeCounter();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        ExecutorService cached = Executors.newCachedThreadPool();

        cached.execute(() -> {
            try {
                simualteBigFileDownload();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        cached.execute(() -> {
            try {
                timeCounter();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        cached.close();
    }
















    private static void simualteBigFileDownload() throws InterruptedException {
        System.out.println("\nInizio dowload del file");
        Thread.sleep(4000);
        System.out.println("Fine download del file");
    }

    private static void timeCounter() throws InterruptedException {
        try {
            for (int i = 1; i < 7; i++) {
                Thread.sleep(1000);
                System.out.print("\n " + i + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
