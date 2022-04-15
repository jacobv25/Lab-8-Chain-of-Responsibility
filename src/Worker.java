import org.w3c.dom.html.HTMLAreaElement;

public class Worker extends Employee{

    public Worker(String name) {
        super(name);
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard hazard){
        if(r == null) {
            fixIt();
        }
        else{
            fixIt();
            super.getDirectOverseer().seeDanger(this, hazard);
        }
    }

    @Override
    public void evacuate(){
        super.evacuate();//me first
    }

    public void fixIt(){
        String workerName = getName();
        System.out.println(workerName + " is fixing it.");
    }
}
