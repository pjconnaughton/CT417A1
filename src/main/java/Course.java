
import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
    private String courseName;
    private ArrayList<Student> students;
    private ArrayList<SingleModule> modules;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String name) {
        courseName = name;
    }

    public void setStartDate(LocalDate start) {
        startDate = start;
    }

    public void setEndDate(LocalDate end) {
        endDate = end;
    }

    public void addModule(SingleModule m) {
        modules.add(m);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<SingleModule> getModules() {
        return modules;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getCourseName() {
        return courseName;
    }
}
