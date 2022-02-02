import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Peter", "SS9988T", 50.000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2.000);
        assertEquals(52.000, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.5, developer.payBonus(), 0.0);
    }
}
