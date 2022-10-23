
import java.util.ArrayList;
import java.util.Date;

public class Student {

	/*		a. A student class should contain some attributes such as (Name, Age, DOB, ID,
			username, courses and modules registered for, etc.).
			A specific method (getUsername()) will generate the student’s username by
			concatenating their name and age
			b. A similar lecturer class should contain some attributes such as (Name, Age, DOB, ID,
			username, and modules teaching, etc.).
			A specific method (getUsername()) will generate the lecturer’s username by
			concatenating their name and age.
			c. A module class, which should contain information such as module name, id (e.g.
			CT417), list of students, courses it is associated with, and lecturer responsible).
			d. A course programme class containing course name (CS & IT or ECE, etc.), list of
			modules, list of students that are enrolled, academic start date and end date.
			Start and end dates should use Terasoluna Joda Time classes (i.e. DateTime), which
			must be added as a project dependency (see
			https://mvnrepository.com/artifact/org.terasoluna.gfw/terasoluna-gfw-jodatime). */

    private String name;
    private int age;
    private String dob;
    private long id;
    private String username;
    private ArrayList<SingleModule> modules;
    private ArrayList<Course> courses;

    public Student(String name, int age, String dob, long id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        createUsername();
        modules = new ArrayList<SingleModule>();
        courses = new ArrayList<Course>();
    }

    public void createUsername() {
        this.username = ""+name.toLowerCase().replaceAll(" ", "")+age;
    }

    public String getUsername() {
        return username;
    }

    public void addModule(SingleModule module) {
        modules.add(module);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public ArrayList<SingleModule> getModules() {
        return modules;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
