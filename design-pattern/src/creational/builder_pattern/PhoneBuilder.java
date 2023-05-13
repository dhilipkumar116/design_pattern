package creational.builder_pattern;

// builder is responsible to create customized phone.
// eg:
// 1) one can ask phone having features of os,ram,screen
// 2) one can ask phone having features of os,storage, default color 
public class PhoneBuilder {
    private String os;
    private int ram;
    private int storage;
    private double screenSize;
    private String color;

    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
    }
    public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setStorage(int storage){
        this.storage = storage;
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize){
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, storage, screenSize, color);
    }

}
