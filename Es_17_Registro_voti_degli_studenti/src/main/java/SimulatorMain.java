import java.util.*;
import java.util.concurrent.*;

public class SimulatorMain {
    public static void main(String[] args) throws InterruptedException {
        // Dati di esempio
        String[] names = {"Anna", "Luca", "Giulia", "Marco", "Giovanni", "Francesca", "Sara", "Anna", "Matteo", "Simona"};
        String[] surnames = {"Rossi", "Bianchi", "Verdi", "Neri", "Rossi", "Bianchi", "Rossi", "Gialli", "Neri", "Rossi"};

        // Crea un oggetto GradeRegister
        GradeRegister register = new GradeRegister();

        // Lista di studenti
        List<Student> students = new ArrayList<>();
        Random rand = new Random();

        // Crea 100 studenti con nomi, cognomi e voti casuali
        for (int i = 0; i < 100; i++) {
            String name = names[rand.nextInt(names.length)];
            String surname = surnames[rand.nextInt(surnames.length)];
            int grade = 2 + rand.nextInt(5); // Voti tra 2 e 6
            students.add(new Student(name, surname, grade, register));
        }

        // Esegui i task in modo concorrente
        ExecutorService executorService = Executors.newFixedThreadPool(4); // Utilizza 4 thread
        for (Student student : students) {
            executorService.submit(student);
        }

        // Aspetta che tutti i task siano completati
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // Stampa i risultati
        System.out.println("Numero di voti inseriti: " + register.getTotalVotes());
        System.out.println("Media dei voti: " + register.calculateAverage());
        System.out.println("Numero di allievi di nome Anna: " + register.getAnnaCount());
        System.out.println("Numero di allievi con cognome Rossi: " + register.getRossiCount());
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getSurname() + ", " + student.getGrade());
        }
    }
}
