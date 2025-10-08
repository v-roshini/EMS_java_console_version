🧑‍💼 Employee Management System
📘 Project Overview

The Employee Management System is a simple Java console-based application that allows users to Add, View, Update, and Delete employees.
It demonstrates the use of Object-Oriented Programming (OOP) concepts like classes, objects, encapsulation, and lists for data storage.

⚙️ Features

✅ Add new employees with name, role, salary, and department.
✅ View all employees in the system.
✅ Update existing employee details.
✅ Delete employees by their ID.
✅ Input validation for name and salary.

🧩 Project Structure
src/
│
├── model/
│   └── Employee.java
│
├── service/
│   └── EmployeeService.java
│
└── Main.java

1. model/Employee.java

Represents the Employee entity with fields:

id (auto-generated)

name

role

salary

department

Contains getters, setters, and toString() method.

2. service/EmployeeService.java

Handles business logic like adding, viewing, updating, and deleting employees.

Uses an ArrayList<Employee> to store employee data temporarily (no database).

Uses Scanner for console input.

3. Main.java

Entry point of the program.

Displays menu options for managing employees.

Uses switch statements and loops to navigate user choices.

🖥️ How to Run
1. Prerequisites

Install Java JDK 8+

Use any IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

2. Steps

Clone or download the project.

Open it in your IDE.

Run the Main.java file.

3. Example Console Output
--- Employee Management System ---
1. Add Employee
2. View Employees
3. Update Employee
4. Delete Employee
0. Exit
Enter choice: 1
Enter name: John Doe
Enter role: Developer
Enter salary: 50000
Enter department: IT
Employee added successfully!

🧠 Concepts Used

Object-Oriented Programming (Classes, Objects, Encapsulation)

Collections Framework (ArrayList)

Input Validation

CRUD Operations

Modular Code Design

🚀 Future Enhancements

Store data in a database (MySQL)

Add login system for admin/HR users

Include search and filter features

Build a web version using Servlets/JSP or Spring Boot
