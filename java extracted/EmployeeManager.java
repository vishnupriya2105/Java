import java.util.*;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private int empIdCounter = 1;
    private int deptIdCounter = 1;

    public void addDepartment(String name, String creationDate, Employee head) {
        Department dept = new Department(deptIdCounter++, name, creationDate, head);
        departments.add(dept);
        System.out.println("Department added.");
    }

    public void deleteDepartment(int deptId) {
        for (Department d : departments) {
            if (d.id == deptId) {
                if (!d.employees.isEmpty()) {
                    System.out.println("Can't delete department with employees.");
                    return;
                }
                departments.remove(d);
                System.out.println("Department deleted.");
                return;
            }
        }
        System.out.println("Department not found.");
    }

    public void addEmployee(String name, String dob, double salary, String address,
                            String role, String joiningDate, double bonus, int deptId, Integer managerId) {
        Department dept = getDepartmentById(deptId);
        Employee manager = getEmployeeById(managerId);
        Employee emp = new Employee(empIdCounter++, name, dob, salary, address, role, joiningDate, bonus, manager, dept);
        employees.add(emp);
        if (dept != null) dept.employees.add(emp);
        System.out.println("Employee added.");
    }

    public void updateEmployee(int id, String name) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            emp.name = name;
            System.out.println("Employee updated.");
        }
    }

    public void moveEmployee(int empId, int newDeptId) {
        Employee emp = getEmployeeById(empId);
        Department newDept = getDepartmentById(newDeptId);
        if (emp != null && newDept != null) {
            if (emp.department != null) emp.department.employees.remove(emp);
            newDept.employees.add(emp);
            emp.department = newDept;
            System.out.println("Employee moved.");
        }
    }

    public void listEmployees() {
        for (Employee e : employees) {
            System.out.println(e.id + " - " + e.name);
        }
    }

    public void listDepartments() {
        for (Department d : departments) {
            System.out.println(d.id + " - " + d.name);
        }
    }

    public void expandDepartment(int Did) {
        Department d = getDepartmentById(Did);
        if (d != null) {
            System.out.println(d.name + " has employees:");
            for (Employee e : d.employees) {
                System.out.println(" - " + e.name);
            }
        }
    }

    private Employee getEmployeeById(Integer id) {
        if (id == null) return null;
        for (Employee e : employees) {
            if (e.id == id) return e;
        }
        return null;
    }

    private Department getDepartmentById(int id) {
        for (Department d : departments) {
            if (d.id == id) return d;
        }
        return null;
    }
}