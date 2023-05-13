package creational.factory_pattern.course;

import java.util.*;

public abstract class Course {
    protected List<Module> modules = new ArrayList<>();
    public List<Module> getModule() {
        return modules;
    }
    public abstract void createCourse();
}
