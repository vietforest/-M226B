package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;

import java.util.Objects;

public class Dancer extends Participant{


    public Dancer(String name, int age, Category category, Level level, double point) {
        super(name, age, category, level, point);
    }

    @Override
    public void show() {
        System.out.println(getName() + " balla sulle musiche dello Schiaccianoci." );
    }
}
