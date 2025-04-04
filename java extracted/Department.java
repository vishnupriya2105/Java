import java.util.ArrayList;
import java.util.List;

public class Department {
    public int id;
    public String name;
    public String creationDate;
    public Employee head;
    public List<Employee> employees = new ArrayList<>();

    public Department(int id, String name, String creationDate, Employee head) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.head = head;
    }
}