import java.util.ArrayList;
import java.util.List;

public class Manager extends Administrator{

    public Manager(String name) {
        super(name);
    }

    public List<Decision> suggestDecisions(Hazard h){
        Decision decision;
        if(h.getHazardLevel() < 1){ //no need to evacuate
            decision = new FileReport(h);
        }
        else{ //evacuate when hazard level above 1
            decision = new Evacuation(h);
        }
        List<Decision> decisions = new ArrayList<>();
        decisions.add(decision);
        return decisions;
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        boolean reportToCEO = true;
        for (Employee e  : getMembers()) {
            DirectAdministrator d = (DirectAdministrator) e;
            if(d.getFeedback(h) == false) {
                reportToCEO = false;
            }
        }
        if(reportToCEO && getDirectOverseer() != null) {
            getDirectOverseer().seeDanger(this, h);
        }
    }
}
