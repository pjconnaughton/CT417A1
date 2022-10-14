
import java.util.ArrayList;

public class SingleModule {
    private String name;
    private String moduleID;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private Lecturer lecturer;

    public SingleModule(String name, String moduleID, Lecturer lecturer) {
        this.name = name;
        this.moduleID = moduleID;
        this.lecturer = lecturer;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }
}
