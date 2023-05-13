package LLD.ParkingLotDesign;

public class EntryGate extends Gate{
    
    EntryGate(String name, ParkingFloor parkingFloor) {
        this.name = name;
        this.parkingFloor = parkingFloor;
    }

    public void attendUser(User user) {
        this.user = user;
        vehicleHistory.add(user.getVehicle());
    }

    public void parkVehicle(Vehicle vehicle, int floor){
        
    };



}
