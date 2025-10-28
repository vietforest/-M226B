package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;
import ch.samt.talentshow.show.TheShow;

public abstract class Participant implements TheShow {
    private String name;
    private int age;
    private Category category;
    private Level level;
    private double point;

    //heritage
    double BEGINNER_LEVEL = 1;
    double INTERMEDIATE_LEVEL = 1.0;
    double PROFESSIONAL_LEVEL = 2.0;
    double CATEGORY_SINGER = 1;
    double CATEGORY_DANCER = 1.0;
    double CATEGORY_MAGICIAN = 2.0;


    public Participant(String name, int age, Category category, Level level, double point) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.level = level;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    @Override
    public void point() {
        if ((category == Category.MAGICIAN) && (level == Level.BEGINNER)) {
            System.out.print("Punteggio: " + getPoint()*BEGINNER_LEVEL*CATEGORY_MAGICIAN);
        }
        else if ((category == Category.MAGICIAN) && (level == Level.INTERMEDIATE)) {
            System.out.print("Punteggio: " + getPoint()*INTERMEDIATE_LEVEL*CATEGORY_MAGICIAN);
        }
        else if ((category == Category.MAGICIAN) && (level == Level.PROFESSIONAL)) {
            System.out.print("Punteggio: " + getPoint()*PROFESSIONAL_LEVEL*CATEGORY_MAGICIAN);
        }
        else if ((category == Category.DANCER) && (level == Level.BEGINNER)) {
            System.out.print("Punteggio: " + getPoint()*BEGINNER_LEVEL*CATEGORY_DANCER);
        }
        else if ((category == Category.DANCER) && (level == Level.INTERMEDIATE)) {
            System.out.print("Punteggio: " + getPoint()*INTERMEDIATE_LEVEL*CATEGORY_DANCER);
        }
        else if ((category == Category.DANCER) && (level == Level.PROFESSIONAL)) {
            System.out.print("Punteggio: " + getPoint()*PROFESSIONAL_LEVEL*CATEGORY_DANCER);
        }
        else if ((category == Category.SINGER) && (level == Level.BEGINNER)) {
            System.out.print("Punteggio: " + getPoint()*BEGINNER_LEVEL*CATEGORY_SINGER);
        }
        else if ((category == Category.SINGER) && (level == Level.INTERMEDIATE)) {
            System.out.print("Punteggio: " + getPoint()*INTERMEDIATE_LEVEL*CATEGORY_SINGER);
        }
        else if ((category == Category.SINGER) && (level == Level.PROFESSIONAL)) {
            System.out.print("Punteggio: " + getPoint()*PROFESSIONAL_LEVEL*CATEGORY_SINGER);
        }
    }
}
