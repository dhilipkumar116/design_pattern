package creational.factory_pattern.course;

public class HLD extends Course{
    HLD(){
        System.out.println("HLD is choosen:");
    }
    @Override
    public void createCourse(){
        modules.add(new IntroModule());
        modules.add(new WebsiteDesignModule());
        modules.add(new ConclusionModule());
    }
}
