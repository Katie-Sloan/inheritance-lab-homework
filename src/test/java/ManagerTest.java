import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("David Brent", "JL202101A", 50000.00, "Slough Office");
    }

    @Test
    public void canGetName(){
        assertEquals("David Brent", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JL202101A", manager.getNiNumber());
    }

}
