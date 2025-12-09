package creatures;

import creatures.Dolphin;
import org.junit.jupiter.api.*;

public class DolphineTest {
    public Dolphin dolphin;

    @BeforeEach
    public void setUp() {
        dolphin = new Dolphin("Darwin", 10, 50, 10 , 50 , 41);
    }
    @Test
    public void testMakeSound(){
        //given
        dolphin = new Dolphin("Darwin", 10, 50, 10, 50 , 41);
        //when
        dolphin.makeSound();
        //then
        Assertions.assertEquals("Eee-eee-eee (click di delfino)", dolphin.makeSound());
    }

    @Test
    public void testPlay(){
        //given
        dolphin = new Dolphin("Darwin", 10, 50, 10, 50 , 41);
        //when
        double energy = dolphin.getEnergy();
        dolphin.play();
        //then
        Assertions.assertEquals(energy - 5, dolphin.getEnergy());
    }

    @Test
    public void testHunt(){
        //given
        dolphin = new Dolphin("Darwin", 10, 50, 10, 50 , 41);
        //when
        boolean per = dolphin.hunt();
        //then
        Assertions.assertEquals (true, dolphin.hunt());
    }
}
