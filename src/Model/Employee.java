package Model;
public class Employee {
    private int id;
    private String name;
    private String role;
    private double salary;
    private String department;

    public Employee(int id, String name, String role, double salary, String department) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.department = department;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
                ", Name: " + name +
                ", Role: " + role +
                ", Salary: $" + salary +
                ", Department: " + department;
    }
}
