import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private static ElevatorSystem instance;

    public List<Elevators> getElevatorsList() {
        return elevatorsList;
    }

    public void setElevatorsList(List<Elevators> elevatorsList) {
        this.elevatorsList = elevatorsList;
    }

    public List<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<Request> requestList) {
        this.requestList = requestList;
    }

    private List<Elevators> elevatorsList;

    private List<Request> requestList;
    public static synchronized ElevatorSystem getInstance()
    {
        if(instance==null)
        {
            instance=new ElevatorSystem();

        }
        return instance;
    }

    public ElevatorSystem() {
        this.elevatorsList = new ArrayList<>();
        this.requestList = new ArrayList<>();
    }

    // create Request
    public Request createRequest(String id,int startFloor,int endFloor)
    {
        Request request= new Request(id,startFloor,endFloor);
        requestList.add(request);
        return request;
    }
    // create an ELevators
    public Elevators createElevator(String id, int currentFloor, Direction direction,List<Request> requests)
    {
        Elevators elevator= new Elevators(id,currentFloor, direction,requests);
        elevatorsList.add(elevator);
        return elevator;
    }

    public List<Elevators> optimalElevators(Request request)
    {
        List<Elevators> ans= new ArrayList<>();

        for(Elevators elevators:elevatorsList)
        {
          if(request.getDirection()==Direction.UP && elevators.getDirection()==Direction.UP && elevators.getCurrentFloor()<=request.getStartFloor())
          {
              ans.add(elevators);
          }
          if(request.getDirection()==Direction.DOWN && elevators.getDirection()==Direction.DOWN && elevators.getCurrentFloor()>=request.getStartFloor())
            {
                ans.add(elevators);
            }
        }
        if(ans.isEmpty())
        {
            return elevatorsList;
        }
        return ans;
    }
    public Elevators assignRequest(Request request, List<Elevators> elevators)
    {
        Elevators bestElevators= null;
        int minDistance= Integer.MAX_VALUE;
        for(Elevators elevator:elevators)
        {
            int distance =Math.abs(elevator.getCurrentFloor()- request.getStartFloor());
            if(distance< minDistance)
            {
                minDistance= distance;
                bestElevators= elevator;
            }
        }
        assert bestElevators != null;
        bestElevators.addRequest(request);
        return bestElevators;
    }
}
