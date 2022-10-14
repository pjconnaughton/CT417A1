
import java.util.ArrayList;

public class Lecturer {
    private String name;
    private int age;
    private String dob;
    private long id;
    private String username;
    private ArrayList<SingleModule> modules;

    public Lecturer(String name, int age, String dob, long id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        createUsername();
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
}
