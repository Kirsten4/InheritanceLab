package management;
import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nationalInsuranceNo, double salary, String deptName){
        super(name, nationalInsuranceNo, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }

}
