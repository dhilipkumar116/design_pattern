package creational.builder_pattern;

public class Phone {
    private String os;
    private int ram;
    private int storage;
    private double screenSize;
    private String color;

    Phone(String os, int ram, int storage, double screenSize, String color) {
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.color = color;
    }

    public String getOs() {
        return os;
    }
    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public String getColor() {
        return color;
    }
}
