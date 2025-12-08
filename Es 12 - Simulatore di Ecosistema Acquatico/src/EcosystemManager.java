import java.util.ArrayList;
import java.util.List;

public class EcosystemManager {
    List<AcquaticCreature> creatures = new ArrayList<AcquaticCreature>();

    public AcquaticCreature getCreatures(String name) {
        for (AcquaticCreature creature : creatures) {
            if (creature.getName().equals(name)) {
                return creature;
            }
        }
        return null;
    }


    public void addCreature(AcquaticCreature creature) {
        creatures.add(creature);
    }

    public void filterByEnergy(double energy) {
        creatures.stream().filter(creatures -> creatures.getEnergy() >= energy)
                .map(AcquaticCreature -> AcquaticCreature)
                .forEach(creatures -> System.out.println(creatures.getName()+ " " + "(" + creatures.getEnergy() + ")"));
    }

    public void getAdultCreaturesNames(int age){
        System.out.println("\n Creature con l'età >= " + age);
        for (AcquaticCreature creature : creatures) {
            if (creature.getAge() >= age) {
                System.out.println(creature.getName() + " " + creature.getAge());
            }
        }
    }

    public void findMostDangerousPredators(int energy, int ferocity){
        creatures.stream().filter(creature -> creature instanceof Predator)
                .filter(creature -> ((Predator) creature).getFerocity() >= ferocity)
                .map(AcquaticCreature::getName).forEach(name -> System.out.println(name));
    }

    public void callAllPredatorsPolimorphicMethods(Predator predator){
        predator.eat();
        predator.makeSound("");
    }
    public void callPredatorsInheritedMethods(Predator predator){
        predator.move();
    }
}
