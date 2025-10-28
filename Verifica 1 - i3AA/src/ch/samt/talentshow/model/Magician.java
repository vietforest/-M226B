package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;

public class Magician extends Participant{


    public Magician(String name, int age, Category category, Level level, double point) {
        super(name, age, category, level, point);
    }

    @Override
    public void show() {
        System.out.println(getName() + " fa sparire il coniglio nel cilindro.");
    }
}
