public abstract class DirectAdministrator extends Administrator{

    public DirectAdministrator(String name) {
        super(name);
    }

    public boolean getFeedback(Hazard h){
        //get feedback
        System.out.println("Feedback by "+getName());
        if(h.getHazardLevel() > 1){
            return true;
        }
        else {return false;}
    }

    public void seeDanger(HReporter_IF r, Hazard hazard){
        System.out.println(getName()+"'s got it!");
        for (Employee e: getMembers()){
            if(e != r){
                e.seeDanger(this, hazard);
            }
        }
        if(getDirectOverseer() != null){
            getDirectOverseer().seeDanger(this, hazard);
        }
    }
}
