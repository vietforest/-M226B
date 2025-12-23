import java.util.Random;

public class Student implements Runnable {
    private String name;
    private String surname;
    private int grade;
    private GradeRegister register;

    // Costruttore
    public Student(String name, String surname, int grade, GradeRegister register) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.register = register;
    }

    // Metodo per aggiungere il voto
    public void addNewGrade() {
        register.addGrade(grade, name, surname);
    }

    @Override
    public void run() {
        addNewGrade();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }
}
