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

}
