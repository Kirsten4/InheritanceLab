package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNo;
    private double salary;

    public Employee(String name, String nationalInsuranceNo, double salary) {
        this.name = name;
        this.nationalInsuranceNo = nationalInsuranceNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNo() {
        return nationalInsuranceNo;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increment){
        salary += increment;
    }

    public double payBonus(){
        return salary * 0.01;
    }
}
