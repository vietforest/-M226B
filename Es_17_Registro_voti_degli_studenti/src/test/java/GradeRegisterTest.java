import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradeRegisterTest  {

    @Test
    public void testAddGrade() {
        GradeRegister register = new GradeRegister();
        register.addGrade(5, "Anna", "Rossi");
        register.addGrade(6, "Marco", "Bianchi");

        assertEquals(2, register.getTotalVotes());
        assertEquals(5.5, register.calculateAverage());
        assertEquals(1, register.getAnnaCount());
        assertEquals(1, register.getRossiCount());
    }

    @Test
    public void testNoGrades() {
        GradeRegister register = new GradeRegister();

        assertEquals(0, register.getTotalVotes());
        assertEquals(0, register.calculateAverage());
        assertEquals(0, register.getAnnaCount());
        assertEquals(0, register.getRossiCount());
    }
}
