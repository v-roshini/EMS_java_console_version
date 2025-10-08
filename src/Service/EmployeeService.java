package Service;

import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    private final ArrayList<Employee> employees = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private int idCounter = 1;

    public void addEmployee() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }

        System.out.print("Enter role: ");
        String role = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        if (salary <= 0) {
            System.out.println("Salary must be greater than 0!");
            return;
        }

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        Employee emp = new Employee(idCounter++, name, role, salary, department);
        employees.add(emp);
        System.out.println("Employee added successfully!");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to show.");
            return;
        }
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.print("Enter new name: ");
                emp.setName(scanner.nextLine());

                System.out.print("Enter new role: ");
                emp.setRole(scanner.nextLine());

                System.out.print("Enter new salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();
                if (salary > 0) emp.setSalary(salary);

                System.out.print("Enter new department: ");
                emp.setDepartment(scanner.nextLine());

                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Deleted (if existed).");
    }
}
