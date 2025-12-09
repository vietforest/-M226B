package creatures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SharkTest {
    public Shark shark;

    @BeforeEach
    public void setUp() {
        shark = new Shark("Marko", 15, 20, 15, 50);
    }

    @Test
    public void testSharkSound() {
        //given
        shark = new Shark("Marko", 15, 20, 15, 50);
        //when
        shark.makeSound();
        //then
        Assertions.assertEquals("Dun-dun... dun-dun... (musica di squalo)", shark.makeSound());
    }
    @Test
    public void testShartHunt (){
        //given
    shark = new Shark("Marko", 15, 20, 15, 50);
    //when
    boolean per = shark.hunt();
    //then
    Assertions.assertEquals (per, shark.hunt());
    }
}
