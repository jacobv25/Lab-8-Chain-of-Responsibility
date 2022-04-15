import java.util.ArrayList;
import java.util.List;

public abstract class Administrator extends Employee{

    private List<Employee> members;

    public Administrator(String name) {
        super(name);
        members = new ArrayList<>();
    }

    public void evacuate(){
        System.out.println(getName()+"'s member size = " + members.size());
        for ( Employee e : members) {
            e.evacuate();
        }
        System.out.println(getName() + " has evacuated now that their members have evacuated.");
    }

    public List<Employee> getMembers() {
        return members;
    }

    public void addMember(Employee e){
        members.add(e);
    }
}
