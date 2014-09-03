/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee extends Employee {
    private String name;
    private String aliasid;
    private String jobtitle;
    private double hourlyWage;

    public HourlyEmployee(String name, String aliasid){
        super(name, aliasid);
        this.name = name;
        this.aliasid = aliasid;
    }
  
    
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAliasid() {
        return aliasid;
    }

    @Override
    public void setAliasid(String aliasid) {
        this.aliasid = aliasid;
    }

    @Override
    public String getJobtitle() {
        return jobtitle;
    }

    @Override
    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(String hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
        
    
}
