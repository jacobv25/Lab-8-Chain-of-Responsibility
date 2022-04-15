public class Hazard {
    private String type;
    private String desp;//what the heck does desp mean?
    private int hazardLevel;

    public Hazard(Hazard h){
        type = h.type;
        desp = h.desp;
        hazardLevel = h.hazardLevel;
    }

    public Hazard(String type, String desp, int hazardLevel) {
        this.type = type;
        this.desp = desp;
        this.hazardLevel = hazardLevel;
    }

    public int getHazardLevel() {
        return hazardLevel;
    }
}
