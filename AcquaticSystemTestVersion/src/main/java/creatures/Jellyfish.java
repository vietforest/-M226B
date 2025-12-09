package creatures;

/**
 * Classe per meduse - creature passive con veleno
 */
public class Jellyfish extends AquaticCreature {
    private boolean isLuminous;

    public Jellyfish(String name, int age, double energy, double speed,  boolean isLuminous) {
        super(name, age, energy, speed);
        this.isLuminous = isLuminous;
    }


    @Override
    public String makeSound() {
        return "... (silenzio di medusa)";
    }


    public void glow() {
        if (isLuminous && energy > 10) {
            this.energy -= 3;
            System.out.println(name + " emette una luce bioluminescente!");
        }
    }

    public boolean isLuminous() { return isLuminous; }
}
