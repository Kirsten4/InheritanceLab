import org.junit.Before;
import org.junit.Test;
import management.Manager;
import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Craig", "SS0011B", 50.000, "CodeClan");
    }

    @Test
    public void managerHasName(){
        assertEquals("Craig", manager.getName());
    }

    @Test
    public void managerHasNi(){
        assertEquals("SS0011B", manager.getNationalInsuranceNo());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.000);
        assertEquals(51.000, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.5, manager.payBonus(), 0.0);
    }

}
