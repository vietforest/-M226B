import javax.sound.midi.Soundbank;

public abstract class AcquaticCreature implements Behaviour {
    private String name;
    private double energy;
    private double speed;
    private int age;

    public AcquaticCreature(String name, double energy, double speed, int age) {
        this.name = name;
        this.energy = energy;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public void move() {
        setEnergy(getEnergy() - 50);
        if (getEnergy() <= 0) {
            System.out.println(getName() + " is death");
        }
    }



}
