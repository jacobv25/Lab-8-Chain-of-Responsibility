public interface HReporter_IF {
    void seeDanger(HReporter_IF r, Hazard h);
    void setDirectOverseer(HReporter_IF overseer);
    HReporter_IF getDirectOverseer();
}
