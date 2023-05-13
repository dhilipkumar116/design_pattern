package creational.factory_pattern.course;

public class CourseFactory {
    public Course getCourse(String courseType){
        switch(courseType){
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:
                throw new IllegalArgumentException("invalid course : "+courseType);
        }
    }
}
