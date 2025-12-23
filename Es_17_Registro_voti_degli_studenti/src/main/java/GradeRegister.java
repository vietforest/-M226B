import java.util.concurrent.atomic.AtomicInteger;

public class GradeRegister {
    private int totalVotes = 0;
    private int totalStudents = 0;
    private AtomicInteger annaCount = new AtomicInteger(0);
    private AtomicInteger rossiCount = new AtomicInteger(0);

    // Metodo per aggiungere un voto
    public synchronized void addGrade(int grade, String name, String surname) {
        totalVotes += grade;
        totalStudents++;

        if ("Anna".equals(name)) {
            annaCount.incrementAndGet();
        }

        if ("Rossi".equals(surname)) {
            rossiCount.incrementAndGet();
        }
    }

    // Calcola la media
    public double calculateAverage() {
        return totalStudents > 0 ? (double) totalVotes / totalStudents : 0;
    }

    // Ottieni il numero di voti inseriti
    public int getTotalVotes() {
        return totalStudents;
    }

    // Ottieni il numero di "Anna"
    public int getAnnaCount() {
        return annaCount.get();
    }

    // Ottieni il numero di "Rossi"
    public int getRossiCount() {
        return rossiCount.get();
    }
}
