package creational.factory_pattern.course;

public class LLD extends Course{
    LLD(){
        System.out.println("LLD is choosen:");
    }
    @Override
    public void createCourse(){
        modules.add(new DemoModule());
        modules.add(new SolidPrincipleModule());
        modules.add(new ConclusionModule());
    }
}
