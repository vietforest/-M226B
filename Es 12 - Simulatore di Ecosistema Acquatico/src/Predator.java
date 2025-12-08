public abstract class Predator extends AcquaticCreature implements Behaviour{
    private int ferocity;

    public Predator(String name, double energy, double speed, int age, int ferocity) {
        super(name, energy, speed, age);
        this.ferocity = ferocity;
    }


    public int getFerocity() {
        return ferocity;
    }

    public void setFerocity(int ferocity) {
        this.ferocity = ferocity;
    }

    public boolean hunt(){
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        double win = randomNum * getEnergy()/3;
        if(win>50){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats other animals" );
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(getName() + " sounds made: " + sound );
    }
}
