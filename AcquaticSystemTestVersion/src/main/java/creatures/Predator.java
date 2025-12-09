package creatures;

public abstract class Predator extends AquaticCreature {
    protected double ferocity; // Livello di ferocia (0-100)

    public Predator(String name, int age, double energy, double speed, double ferocity) {
        super(name, age, energy, speed);
        this.ferocity = ferocity;
    }

    public double getFerocity() { return ferocity; }
    public abstract boolean hunt();
}
