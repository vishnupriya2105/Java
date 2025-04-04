import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Dept  2. Add Emp  3. Move Emp  4. List Emps  5. List Depts  6. Expand Dept  7. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Dept Name: ");
                    String name = sc.next();
                    System.out.print("Creation Date: ");
                    String date = sc.next();
                    manager.addDepartment(name, date, null);
                    break;
                case 2:
                    System.out.print("ID: "); int id = sc.nextInt();
                    System.out.print("Name: "); String n = sc.next();
                    System.out.print("DOB: "); String dob = sc.next();
                    System.out.print("Salary: "); double sal = sc.nextDouble();
                    System.out.print("Address: "); String addr = sc.next();
                    System.out.print("Role: "); String role = sc.next();
                    System.out.print("Join Date: "); String join = sc.next();
                    System.out.print("Bonus %: "); double bonus = sc.nextDouble();
                    System.out.print("Dept ID: "); int deptId = sc.nextInt();
                    System.out.print("Manager ID (or 0): "); int mid = sc.nextInt();
                    manager.addEmployee(n, dob, sal, addr, role, join, bonus, deptId, mid == 0 ? null : mid);
                    break;
                case 3:
                    System.out.print("Emp ID: "); int Empid = sc.nextInt();
                    System.out.print("New Dept ID: "); int newDept = sc.nextInt();
                    manager.moveEmployee(Empid, newDept);
                    break;
                case 4: manager.listEmployees(); break;
                case 5: manager.listDepartments(); break;
                case 6:
                    System.out.print("Dept ID: "); int Did = sc.nextInt();
                    manager.expandDepartment(Did); break;
                case 7: return;
            }
        }
    }
}