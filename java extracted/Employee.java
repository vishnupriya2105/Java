
public class Employee {
    public int id;
    public String name;
    public String dob;
    public double salary;
    public String address;
    public String role;
    public String join;
    public double bonusPercentage;
    public Employee reportingManager;
    public Department department;

    public Employee(int id, String name, String dob, double salary, String address,
                    String role, String join, double bonusPercentage, Employee reportingManager, Department dept) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.role = role;
        this.join = join;
        this.bonusPercentage = bonusPercentage;
        this.reportingManager = reportingManager;
        this.department = dept;
    }
}