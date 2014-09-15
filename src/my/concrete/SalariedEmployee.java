package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class SalariedEmployee extends Employee {
 
    private double yearlySalary;

    public SalariedEmployee(String lname, String fname, String aliasid) {
        super(lname,  fname, aliasid);
        
    }
    
    public double getSalary() {
        return this.yearlySalary;
    }

    public void setSalary(double salary) {
        if (salary >= 0.0){
        this.yearlySalary = salary;
        }
        else{
            System.out.println("Not a valid Salary!");
        }
    }
        
}
