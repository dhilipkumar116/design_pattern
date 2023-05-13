package LLD.ParkingLotDesign;

public class Main {
    public static void main(String[] args) {
        SlotType s1 = SlotType.SMALL;
        s1.setPriceForParking(20);
        System.out.println(s1.getPriceForParking());
        System.out.println(SlotType.COMPACT.getPriceForParking());
    }   
}
