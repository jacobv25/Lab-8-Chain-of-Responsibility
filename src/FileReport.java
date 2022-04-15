public class FileReport extends Decision{

    public FileReport(Hazard hazard) {
        super(hazard);
    }

    @Override
    public void execute(CEO commander){
       commander.report();
    }
}
