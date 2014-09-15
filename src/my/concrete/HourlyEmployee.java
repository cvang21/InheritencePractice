

package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee extends Employee {

    private double Wage;

    public HourlyEmployee(String lname, String fname, String aliasid){
        super(lname, fname, aliasid);
        this.Wage = 0.00;
    }

    public double getWage() {
        return this.Wage;
    }
   
        
    public void setWage(double hourlyWage) {
        
        if (hourlyWage >= 0.0){
            this.Wage = hourlyWage;
            
            }
        else{
        System.out.println("Must be a valid value!");
        }
    }   
    
}
