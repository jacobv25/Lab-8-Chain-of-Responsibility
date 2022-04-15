public class Evacuation extends Decision{

    public Evacuation(Hazard hazard) {
        super(hazard);
    }

    public void execute(CEO commander){
        commander.evacuate();
    }
}
