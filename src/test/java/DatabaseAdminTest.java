import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin ("Tim Canterbury", "ZQ432101A", 25000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Tim Canterbury", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("ZQ432101A", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Katie Sloan");
        assertEquals("Katie Sloan", databaseAdmin.getName());
    }

    @Test
    public void cannotSetNameToNull() {
        assertEquals("Tim Canterbury", databaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(100.00);
        assertEquals(25100.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryWhereNegativeNumber() {
        databaseAdmin.raiseSalary(-1.00);
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }

}
