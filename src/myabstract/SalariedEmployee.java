
package myabstract;

/**
 *
 * @author Ching Vang
 */
public class SalariedEmployee extends Employee{
        
    private double salary;

    public SalariedEmployee(double salary, String lastname, String fname, String aliasID, String jobTitle) {
        super(lastname, fname, aliasID, jobTitle);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
