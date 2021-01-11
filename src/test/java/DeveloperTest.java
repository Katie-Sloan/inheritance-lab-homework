import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Gareth Keenan", "XV123401A", 30000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Gareth Keenan", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("XV123401A", developer.getNiNumber());
    }

}
