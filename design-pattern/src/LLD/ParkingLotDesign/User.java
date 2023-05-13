package LLD.ParkingLotDesign;


public class User extends Account{
    int balance = 0;
    Vehicle vehicle;

    User(String name,String address, int balance, Vehicle vehicle) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.vehicle = vehicle;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getBalance() {
        return balance;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

}
