package creational.abstract_factory_pattern;

public class GPS {
    String location = "";
    GPS(){
        location = "INDIA";
     }
    public String getLocation() {
        // hard coded
        return location;
    }
    
}
