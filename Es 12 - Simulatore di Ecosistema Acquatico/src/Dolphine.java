public class Dolphine extends Predator {
    private int intelligent;

    public Dolphine(String name, double energy, double speed, int age, int ferocity,int intelligent) {
        super(name, energy, speed, age, ferocity);
        this.intelligent = intelligent;
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(sound);
    }

    @Override
    public void eat() {

    }

}
