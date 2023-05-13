package LLD.ParkingLotDesign;

public class Vehicle {
    String registerNumber;
    VehicleType vehicleType;
    // User 
    boolean isParked = false;

    Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
    public void isParked(boolean isParked) {
        this.isParked = isParked;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }
    public boolean getIsParked() {
        return isParked;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
