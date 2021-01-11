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

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        developer.setName("Katie Sloan");
        assertEquals("Katie Sloan", developer.getName());
    }

    @Test
    public void cannotSetNameToNull() {
        developer.setName(null);
        assertEquals("Gareth Keenan", developer.getName());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000.00);
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryWhereNegativeNumber(){
        developer.raiseSalary(-1.00);
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(300, developer.payBonus(), 0.01);
    }

}
