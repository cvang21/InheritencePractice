package myinterface;

/**
 *
 * @author Ching Vang
 */
public class HourlyEmployee implements Employee {
    @Override
    public abstract void setStartDate();
    
    @Override
    public abstract void setName(String name); 

    @Override
    public abstract String getAliasid();
    
    @Override
    public void setAliasid(String aliasid); 

    @Override
    public String getJobtitle();

    @Override
    public void setJobtitle(String jobtitle);
}
