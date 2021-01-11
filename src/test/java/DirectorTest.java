import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Neil Godwin", "CD123401B", 100000.00, "Company Directors", 1000000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Neil Godwin", director.getName());
    }


}
