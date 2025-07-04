package parkinglot.vehicle;

public abstract class Vehicle{
    protected String licensePlate;
    protected  VehicleType vehicleType;

    public Vehicle(String licensePlate,VehicleType type)
    {
        this.licensePlate=licensePlate;
        this.vehicleType=type;
    }
    public String getLicensePlate()
    {
        return licensePlate;
    }
    public  VehicleType getType()
    {
        return vehicleType;
    }

}