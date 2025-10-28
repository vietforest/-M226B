package ch.samt.talentshow;

import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;
import ch.samt.talentshow.model.Dancer;
import ch.samt.talentshow.model.Magician;
import ch.samt.talentshow.model.Participant;
import ch.samt.talentshow.model.Singer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Participant anna = new Singer("Anna", 22, Category.SINGER, Level.BEGINNER, 9.5);
            Participant gianni = new Dancer("Gianni", 19, Category.DANCER, Level.INTERMEDIATE, 7.5);
            Participant charlie = new Magician("Charlie", 25, Category.MAGICIAN, Level.BEGINNER, 3.25);
            Participant diana = new Singer("Diana", 30, Category.SINGER, Level.INTERMEDIATE, 8);
            Participant Marco = new Dancer("Marco", 21, Category.DANCER, Level.PROFESSIONAL, 4.5);

            Participant[] participants = {anna, gianni, charlie, diana, Marco};
            for (Participant p : participants) {
                System.out.println(p.getName() + " " + p.getAge() + " anni" + ", sale sul parco");
                p.show();
                System.out.print(p.getName() + "(" + p.getCategory() + "," + p.getLevel() + ")" + "->");
                p.point();
                System.out.println("\n");
                System.out.println("----------------------------------------\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}