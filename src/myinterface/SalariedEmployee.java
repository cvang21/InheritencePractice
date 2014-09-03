
package myinterface;

/**
 *
 * @author Ching Vang
 */
public class SalariedEmployee implements Employee {
    
    @Override
    public abstract void setStartDate();
    
    @Override
    public abstract void setName(String name); 

    @Override
    public abstract String getAliasid(){
    String alias;
        return alias;
    }
    
    @Override
    public void setAliasid(String aliasid); 

    @Override
    public String getJobtitle();

    @Override
    public void setJobtitle(String jobtitle);
}
