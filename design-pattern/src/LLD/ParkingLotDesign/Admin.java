package LLD.ParkingLotDesign;

public class Admin extends Account{
    ParkingLot parkingLot;

    Admin(String name, String address, ParkingLot parkingLot) {
        this.name = name;
        this.address = address;
        this.parkingLot = parkingLot;
    }
    
    public void updateParkingSlot(int floor, SlotType slotType){}
    public void updateSlotPrice(SlotType slotType, int amount) {}
    public void addFloor() {};
    public void removeFloor() {};


}
