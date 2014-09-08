package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class SalariedEmployee extends Employee {
 
    private String yearlySalary;

    public SalariedEmployee(String name, String aliasid) {
        super(name, aliasid);
        this.yearlySalary = null;
    }
    
    public String getSalary() {
        return yearlySalary;
    }

    public void setSalary(String salary) {
        this.yearlySalary = salary;
    }
    
        
}
