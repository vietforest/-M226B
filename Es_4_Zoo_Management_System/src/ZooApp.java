import zoo.Animal;
import zoo.Elephant;
import zoo.Lion;
import zoo.Parrot;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZooApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        Animal animal = new Lion("lion", 10, true);
        Animal animal2 = new Elephant("zommy", 10, false);
        Animal animal3 = new Parrot("tom", 10);
        animals.add(animal);
        animals.add(animal2);
        animals.add(animal3);
        for (Animal a : animals) {
            System.out.println(a.getName());
            System.out.println(a.makeSound());
            a.eat("banana");
        }

    }
}