public abstract class Decision implements Comparable<Decision>{
    private Manager suggestedBy;
    int priority;
    private Hazard hazard;

    public Decision(Hazard hazard) {
        this.hazard = hazard;
    }

    @Override
    public int compareTo(Decision o) {
        return this.priority - o.priority;
    }

    public abstract void execute(CEO ceo);

    public Hazard getHazard(){
        return hazard;
    }
}
