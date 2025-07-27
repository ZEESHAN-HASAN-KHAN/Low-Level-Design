import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem= ElevatorSystem.getInstance();
        Request request1= elevatorSystem.createRequest("1",2,4);
       System.out.println( request1.toString());
        Request request2= elevatorSystem.createRequest("1",3,4);
        System.out.println(request2.toString());
        Elevators elevators1=elevatorSystem.createElevator("1",1,Direction.UP,elevatorSystem.getRequestList());
        System.out.println(elevators1.toString());
        Elevators elevators2=elevatorSystem.createElevator("2",1,Direction.DOWN,elevatorSystem.getRequestList());
        System.out.println(elevators2.toString());

        List<Elevators> optimalElevators=elevatorSystem.optimalElevators(request1);
        for(Elevators el:optimalElevators)
        {
            System.out.println(el.toString());
        }

        Elevators assignElevatore=elevatorSystem.assignRequest(request1,optimalElevators);
        System.out.println(assignElevatore.toString());
    }
}