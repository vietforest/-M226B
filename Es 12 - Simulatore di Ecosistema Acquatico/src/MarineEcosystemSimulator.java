//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MarineEcosystemSimulator {
    public static void main(String[] args) {
        AcquaticCreature shark = new Shark("Mako", 70,100,10,10);
        AcquaticCreature dolphine = new Dolphine("Beluga", 100, 100, 10, 20, 20);
        EcosystemManager ecosystemManager = new EcosystemManager();
        ecosystemManager.addCreature(shark);
        ecosystemManager.addCreature(dolphine);

    /*    for (double i = 0; i < ecosystemManager.getCreatures("Mako").getEnergy(); i++) {
            ecosystemManager.getCreatures("Mako").move();
       }
*/
        ecosystemManager.filterByEnergy(50);
        ecosystemManager.getAdultCreaturesNames(4);



    }
}