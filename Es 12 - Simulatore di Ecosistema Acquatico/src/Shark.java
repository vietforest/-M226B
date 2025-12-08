public class Shark extends Predator implements Behaviour{

    public Shark(String name, double energy, double speed, int age, int ferocity) {
        super(name, energy, speed, age, ferocity);
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(sound);
    }


    @Override
    public void eat() {

    }
}
