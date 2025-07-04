package parkinglot.parkingSpot;

public class ParkingSpotFactory {
    public static ParkingSpot createParkingSpot(ParkingSpotType type,String spotId)
    {
        return switch (type)
        {
            case BIKE -> new BikeSpot(spotId);
            case COMPACT -> new CompactSpot(spotId);
            case LARGE -> new LargeSpot(spotId);
            default -> throw  new IllegalArgumentException("Unknown Parking Spot type :"+type);
        };
    }
}
