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

    @Test
    public void canGetSalary(){
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Slough Office", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals(50500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryWhereNegativeNumber(){
        manager.raiseSalary(-1.00);
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(500, manager.payBonus(), 0.01);
    }


}
