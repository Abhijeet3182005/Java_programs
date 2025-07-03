package com.dkte;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int count = 0;

        while (true) {
            System.out.println("\n=== Employee Management Menu ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Display Employees Joined in Given Year");
            System.out.println("5. Find Employee with Maximum Salary");
            System.out.println("6. Find Employee with Minimum Salary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                // ✅ 2. Add Employee (7 marks)
                case 1:
                    if (count == employees.length) {
                        System.out.println("Cannot add more employees (Limit Reached).");
                        break;
                    }

                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Date of Birth (dd mm yyyy): ");
                    MyDate dob = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    System.out.print("Enter Date of Joining (dd mm yyyy): ");
                    MyDate doj = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

                    employees[count++] = new Employee(name, dob, id, dept, salary, doj);
                    System.out.println("✅ Employee added successfully.");
                    break;

                // ✅ 3. Display All Employees (5 marks)
                case 2:
                    if (count == 0) {
                        System.out.println("No employee records available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(employees[i]);
                        }
                    }
                    break;

                // ✅ 4. Search Employee by ID (5 marks)
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (employees[i].getId() == searchId) {
                            System.out.println("Employee Found:\n" + employees[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found.");
                    break;

                // ✅ 5. Display Employees joined in given Year (6 marks)
                case 4:
                    System.out.print("Enter year to filter (YYYY): ");
                    int year = sc.nextInt();
                    boolean matched = false;
                    for (int i = 0; i < count; i++) {
                        if (employees[i].getDateOfJoining().getYear() == year) {
                            System.out.println(employees[i]);
                            matched = true;
                        }
                    }
                    if (!matched) System.out.println("No employees joined in year " + year);
                    break;

                // ✅ 6. Find Employee with Maximum Salary (6 marks)
                case 5:
                    if (count == 0) {
                        System.out.println("No employees available.");
                        break;
                    }
                    Employee maxEmp = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].getSalary() > maxEmp.getSalary()) {
                            maxEmp = employees[i];
                        }
                    }
                    System.out.println("Employee with Max Salary:\n" + maxEmp);
                    break;

                // ✅ 7. Find Employee with Minimum Salary (6 marks)
                case 6:
                    if (count == 0) {
                        System.out.println("No employees available.");
                        break;
                    }
                    Employee minEmp = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].getSalary() < minEmp.getSalary()) {
                            minEmp = employees[i];
                        }
                    }
                    System.out.println("Employee with Min Salary:\n" + minEmp);
                    break;

                // ✅ 8. Exit the Application (5 marks)
                case 7:
                    System.out.println("Thank you! Exiting the system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
