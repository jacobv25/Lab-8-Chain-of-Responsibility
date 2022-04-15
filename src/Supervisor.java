import java.util.List;

public class Supervisor extends DirectAdministrator{

    public Supervisor(String name) {
        super(name);
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard h){
        for (Employee e : getMembers()){
            Worker w = (Worker)e;
            w.fixIt();
        }
        getDirectOverseer().seeDanger(r, h);
    }

}
