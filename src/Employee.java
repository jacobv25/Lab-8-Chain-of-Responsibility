public abstract class Employee implements HReporter_IF{

    private String name;
    private Administrator overseer;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void evacuate(){
        System.out.println(name + " is evacuating.");
    }

    @Override
    public void setDirectOverseer(HReporter_IF overseer) {
        this.overseer = (Administrator) overseer;
    }

    @Override
    public HReporter_IF getDirectOverseer() {
        return overseer;
    }
}
