package creational.factory_pattern.course;

public class Client {

    public static void main(String[] args) {
        CourseFactory cf = new CourseFactory();
        Course course = cf.getCourse("HLD");
        course.createCourse();
    }

}
