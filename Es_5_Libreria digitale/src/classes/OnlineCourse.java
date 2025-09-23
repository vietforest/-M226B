package classes;
import Enum.*;
import Interfaces.Purchasable;
public final class OnlineCourse extends DigitalContent {
    private String instructor;
    private Difficulty difficulty;
    private int hours;

    public OnlineCourse(int id, String name, double basePrice, double currentDiscount, String instructor, Difficulty difficulty, int hours) {
        super(id, name, basePrice, currentDiscount);
        this.instructor = instructor;
        this.difficulty = difficulty;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void getCertificationEligible(){
        if(getHours() > 10){
            System.out.println("Eligible");
        }
    }

    @Override
    public String getContentType() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }
}
