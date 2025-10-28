package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;

public class Singer extends Participant {


    public Singer(String name, int age, Category category, Level level, double point) {
        super(name, age, category, level, point);
    }

    @Override
    public void show() {
        System.out.println(getName()+" canta \'O mia bela Madunina\' ");
    }
}
