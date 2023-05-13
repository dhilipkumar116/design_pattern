package LLD.ParkingLotDesign;

public class ExitGate extends Gate{
    
    ExitGate(String name, ParkingFloor parkingFloor) {
        this.name = name;
        this.parkingFloor = parkingFloor;
    }

    public void attendUser(User user) {
        this.user = user;
       
    }

    public void scanAndPay(User user) {
        // payment gateway
        this.user = null; // detaching user
    }

}
