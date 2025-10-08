import Service.EmployeeService;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService empService = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> empService.addEmployee();
                case 2 -> empService.viewEmployees();
                case 3 -> empService.updateEmployee();
                case 4 -> empService.deleteEmployee();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}







