
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
