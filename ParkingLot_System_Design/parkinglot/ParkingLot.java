package parkinglot;

import parkinglot.fee.FeeStrategy;
import parkinglot.fee.FlatRateFeeStrategy;
import parkinglot.parkingSpot.ParkingSpot;
import parkinglot.parkingSpot.ParkingSpotFactory;
import parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {

    private static final ParkingLot INSTANCE=new ParkingLot();
    private final List<ParkingFloor> floors=new ArrayList<>();
    private final Map<String,ParkingTicket> activeTickets=new ConcurrentHashMap<>();

    private FeeStrategy feeStrategy;
    private ParkingLot()
    {
        feeStrategy=new FlatRateFeeStrategy();
    }

    public static  synchronized ParkingLot getInstance()
    {
        return INSTANCE;
    }

    public void addFloor(ParkingFloor floor)
    {
        floors.add(floor);
    }
    public void setFeeStrategy(FeeStrategy feeStrategy)
    {
        this.feeStrategy=feeStrategy;
    }

    public synchronized  ParkingTicket parkVehicle(Vehicle vehicle) throws Exception {
        for(ParkingFloor floor: floors)
        {
            Optional<ParkingSpot> spotOpt=floor.getAvailableSpot(vehicle);

            if(spotOpt.isPresent())
            {
                ParkingSpot spot=spotOpt.get();
                if(spot.assignVehicle(vehicle))
                {
                    ParkingTicket ticket=new ParkingTicket(vehicle,spot);
                    activeTickets.put(vehicle.getLicensePlate(),ticket);
                    return ticket;
                }
            }
        }
        throw new Exception("No Available Spot for "+ vehicle.getType());
    }

    public synchronized double unparkVehicle(String license) throws Exception {
        ParkingTicket ticket = activeTickets.remove(license);
        if (ticket == null) throw new Exception("Ticket not found");

        ticket.getSpot().removeVehicle();

        ticket.setExitTimestamp();
        return feeStrategy.calculateFee(ticket);
    }
}
