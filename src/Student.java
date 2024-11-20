import java.io.Serializable;

// Serialization: saving objects to file on computer to load later
// Deserialization: taking file and making object from it
public class Student implements Serializable { // implements Serializable interface (no methods, marker interface)
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
