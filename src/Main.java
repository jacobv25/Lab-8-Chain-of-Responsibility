public class Main {
    public static void main(String[] args) {
        Supervisor Jack = new Supervisor("Jack");
        Supervisor Jeff = new Supervisor("Jeff");

        ProjectLeader Chuck = new ProjectLeader("Chuck");
        ProjectLeader Denise = new ProjectLeader("Denise");

        ///////////////////////////////////////////
        Worker John = new Worker("John");
        Worker Mary = new Worker("Mary");
        Worker Jane = new Worker("Jane");
        Worker Tom = new Worker("Tom");
        Worker Nick = new Worker("Nick");

        Jack.addMember(John);
        Jack.addMember(Mary);
        Jack.addMember(Jane);
        Jack.addMember(Tom);
        Jack.addMember(Nick);

        John.setDirectOverseer(Jack);
        Mary.setDirectOverseer(Jack);
        Jane.setDirectOverseer(Jack);
        Tom.setDirectOverseer(Jack);
        Nick.setDirectOverseer(Jack);

        /////////////////////////////////////////
        Worker Rob = new Worker("Rob");
        Worker Ed = new Worker("Ed");
        Worker Rick = new Worker("Rick");
        Worker Michael = new Worker("Michael");

        Jeff.addMember(Rob);
        Jeff.addMember(Ed);
        Jeff.addMember(Rick);
        Jeff.addMember(Michael);

        Rob.setDirectOverseer(Jeff);
        Ed.setDirectOverseer(Jeff);
        Rick.setDirectOverseer(Jeff);
        Michael.setDirectOverseer(Jeff);

        //////////////////////////////////////

        Worker Joe = new Worker("Joe");
        Worker Frank = new Worker("Frank");
        Worker Sam = new Worker("Sam");
        Worker Greg = new Worker("Greg");

        Chuck.addMember(Joe);
        Chuck.addMember(Frank);
        Chuck.addMember(Sam);
        Chuck.addMember(Greg);

        Joe.setDirectOverseer(Chuck);
        Frank.setDirectOverseer(Chuck);
        Sam.setDirectOverseer(Chuck);
        Greg.setDirectOverseer(Chuck);
        ///////////////////////////////////

        Worker Amy = new Worker("Amy");
        Worker Will = new Worker("Will");
        Worker Nancy = new Worker("Nancy");
        Worker Adam = new Worker("Adam");

        Denise.addMember(Amy);
        Denise.addMember(Will);
        Denise.addMember(Nancy);
        Denise.addMember(Adam);

        Amy.setDirectOverseer(Denise);
        Will.setDirectOverseer(Denise);
        Nancy.setDirectOverseer(Denise);
        Adam.setDirectOverseer(Denise);
        /////////////////////////////////
        Manager Bob = new Manager("Bob");

        Bob.addMember(Jack);
        Bob.addMember(Jeff);

        Jack.setDirectOverseer(Bob);
        Jeff.setDirectOverseer(Bob);
        /////////////////////////////////
        Manager Rachel = new Manager("Rachel");

        Rachel.addMember(Chuck);
        Rachel.addMember(Denise);

        Chuck.setDirectOverseer(Rachel);
        Denise.setDirectOverseer(Rachel);
        ///////////////////////////////////
        CEO Steve = new CEO("Steve");

        Steve.addMember(Bob);
        Steve.addMember(Rachel);

        Bob.setDirectOverseer(Steve);
        Rachel.setDirectOverseer(Steve);
        //Gas Leak
        String hazardType = "GAS LEAK";
        String desp = "null"; //I'm not sure what desp mean ???
        int hazardLevel  = 2;
        Hazard hazard = new Hazard(hazardType, desp, hazardLevel);
        John.seeDanger(John, hazard);
    }
}
