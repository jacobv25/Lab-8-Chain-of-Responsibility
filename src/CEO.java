import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CEO extends Administrator{

    public CEO(String name) {
        super(name);
    }

    public void implementDecision(List<Decision> ds) {
        ds = sortPriority(ds);
        Decision d = ds.get(0);
        d.execute(this);

        if(d.getHazard().getHazardLevel() > 1) {
            return; // Everyone has evacuated
        }

        d = ds.get(1);
        d.execute(this);
    }

    private List<Decision> sortPriority(List<Decision> ds){
        Collections.sort(ds);
        return ds;
    }

    public void seeDanger(HReporter_IF r, Hazard hazard){
        List<Decision> decisions = new ArrayList<>();
        for (Employee e : getMembers()){
            Manager m = (Manager) e;
            decisions.addAll(m.suggestDecisions(hazard));
        }
        implementDecision(decisions);
    }

    public void report(){
        System.out.println("The city's environmental department is notified.");
    }
}
