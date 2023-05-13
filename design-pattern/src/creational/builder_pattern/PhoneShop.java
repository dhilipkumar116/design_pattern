package creational.builder_pattern;

public class PhoneShop {

    public static void main(String[] args) {
        // can create customized object creation depends on requirement.
        PhoneBuilder phonebuilder = new PhoneBuilder();
        phonebuilder.setOs("snapdragon");
        phonebuilder.setRam(8);
        Phone mycustomPhone = phonebuilder.getPhone();
        System.out.println("os : "+mycustomPhone.getOs());
        System.out.println("ram : "+mycustomPhone.getRam());
        System.out.println("storage : "+mycustomPhone.getStorage());
        System.out.println("screen : "+mycustomPhone.getScreenSize());
        System.out.println("color : "+mycustomPhone.getColor());
    }
    
}
