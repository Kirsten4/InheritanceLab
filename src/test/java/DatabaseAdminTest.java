import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Peter", "SS9988T", 50.000);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2.000);
        assertEquals(52.000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.5, databaseAdmin.payBonus(), 0.0);
    }
}
