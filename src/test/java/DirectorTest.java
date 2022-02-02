import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", "AA1234D", 100.000, "CodeClan", 1000.000);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000.000, director.getBudget(),0.0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2.000);
        assertEquals(102.000, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2, director.payBonus(), 0.0);
    }

    @Test
    public void cannotGetNegativeSalaryRaise(){
        director.raiseSalary(-2.000);
        assertEquals(100.000,director.getSalary(), 0.0);
    }

    @Test
    public void canSetNewName(){
        director.setName("Anna");
        assertEquals("Anna", director.getName());
    }

    @Test
    public void cannotSetNullName(){
        director.setName(null);
        assertEquals("Melinda", director.getName());
    }

}
