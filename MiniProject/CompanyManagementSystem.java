package MiniProject;

//package miniproject.com;
// Mini Project Title :-  Company Management System
import java.util.*;

interface CompanyRules {
    void addEmployee();

    void calculateSalaryWithBonus();

    void displayEmployee();

    void calculateSalary();

    void updatePerformance();

    void promoteEmployee();
}

class Company implements CompanyRules {
    Scanner sc = new Scanner(System.in);

    private Employee[] employees = new Employee[100];
    private int employeeCount = 0;

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Company() {
        Department itDept = new Department(1, "IT");
        Department hrDept = new Department(2, "HR");
        Department mechDept = new Department(3, "MECH");
        Department eleDept = new Department(4, "Electric");
        employees[0] = new Employee(101, "Alice Johnson", 5000, 4.5f, 0.0, itDept);
        employees[1] = new Employee(102, "Bob Smith", 4500, 3.8f, 0.0, hrDept);
        employees[2] = new Employee(103, "Charlie Brown", 6000, 4.9f, 0.0, mechDept);
        employees[3] = new Employee(104, "Diana Prince", 5500, 4.2f, 0.0, eleDept);
        employees[4] = new Employee(105, "Ethan Hunt", 4800, 3.5f, 0.0, itDept);
        employeeCount = 5;
        calculateSalary();
    }

    public void addEmployee() {
        if (employeeCount >= 100) {
            System.out.println("Array is full!");
            return;
        }
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Department ID: ");
        int dId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department Name: ");
        String dName = sc.nextLine();

        Department deptObj = new Department(dId, dName);
        System.out.print("Enter Base Salary: ");
        double baseSalary = sc.nextDouble();
        System.out.print("Enter Rating: ");
        float rating = sc.nextFloat();

        employees[employeeCount] = new Employee(empId, empName, baseSalary, rating, 0.0, deptObj);
        employeeCount++;
        System.out.println("Employee Added Successfully!");
    }

    public void displayEmployee() {
        if (employeeCount == 0) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("---- Employee List ----");
        for (int j = 0; j < employeeCount; j++) {
            System.out.println("Employee Id                   : " + employees[j].getEmpId());
            System.out.println("Employee Name                 : " + employees[j].getEmpName());
            System.out.println("Employee basic salary         : " + employees[j].getBaseSalary());
            System.out.println("Employee Rating               : " + employees[j].getRating());
            System.out.println("Employee Total Salary         : " + employees[j].getTotalSalary());
            System.out.println("Department id is              : " + employees[j].getDept().getDeptId());
            System.out.println("Department                    : " + employees[j].getDept().getDeptName());
            System.out.println("-----------------------------------");
        }
    }

    public void calculateSalary() {
        for (int i = 0; i < employeeCount; i++) {
            double annualSalary = employees[i].getBaseSalary() * 12;
            employees[i].setTotalSalary(annualSalary);
        }
    }

    public void calculateSalaryWithBonus() {
        System.out.println("\n--- Calculating Salaries with Performance Bonuses ---");
        for (int i = 0; i < employeeCount; i++) {
            double base = employees[i].getBaseSalary();
            float rating = employees[i].getRating();
            double bonusPercentage;

            if (rating >= 4.5) {
                bonusPercentage = 0.20; // 20%
            } else if (rating >= 4.0) {
                bonusPercentage = 0.10; // 10%
            } else {
                bonusPercentage = 0.05; // 5%
            }

            double bonusAmount = base * bonusPercentage;
            double totalWithBonus = (base * 12) + bonusAmount;

            employees[i].setTotalSalary(totalWithBonus);
            System.out.println("Employee Name      : " + employees[i].getEmpName());
            System.out.println("Employee Rating    : " + rating);
            System.out.println("Employee Bonus     : " + bonusAmount);
            System.out.println("Total              : " + totalWithBonus);
            System.out.println("-----------------------------------");
        }
    }

    public void updatePerformance() {
        System.out.print("Enter Employee ID to update rating: ");
        int id = sc.nextInt();

        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmpId() == id) {
                System.out.print("Enter new rating for " + employees[i].getEmpName() + ": ");
                float newRating = sc.nextFloat();
                employees[i].setRating(newRating);
                System.out.println("Performance updated!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void promoteEmployee() {
        System.out.println("--- Promoting High Performers (Rating > 4.5) ---");
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getRating() > 4.5) {
                double oldSalary = employees[i].getBaseSalary();
                double newSalary = oldSalary * 1.10; // 10% raise
                employees[i].setBaseSalary(newSalary);
                System.out.println(employees[i].getEmpName() + " promoted! New Base: " + newSalary);
            }
        }
        calculateSalary(); // Recalculate totals after raises
    }

    public Employee[] getEmployees() {
        return this.employees;
    }

}

class Employee {
    private int empId;
    private String empName;
    private double baseSalary;
    private Department dept;
    private float rating;
    private double totalSalary;

    public int getEmpId() {
        return empId;
    }

    public Employee(int empId, String empName, double baseSalary, float rating, double totalSalary, Department dept) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
        this.rating = rating;
        this.totalSalary = totalSalary;
        this.dept = dept;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}

class Department {
    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

public class CompanyManagementSystem {

    public static void main(String[] args) {
        Company c = new Company();
        try (Scanner sc = new Scanner(System.in)) {

            int choice;
            do {
                System.out.println("\n-----------------------------------");
                System.out.println("1. Add new employee : "); // done
                System.out.println("2. Display all employees : "); // done
                System.out.println("3. Search employee by ID : "); // done
                System.out.println("4. Update employee name: "); // done
                System.out.println("5. Update department : "); // done
                System.out.println("6. Delete employee : "); // done
                System.out.println("7. Count total employees : "); // done
                System.out.println("8. Calculate salary with bonus : ");
                System.out.println("9. Deduct salary for low performance : ");// done
                System.out.println("10.Display highest salary employee : "); // done
                System.out.println("11.Display lowest salary employee : "); // done
                System.out.println("12.Update employee rating : "); // done
                System.out.println("13.Promote employee based on rating : "); // done
                System.out.println("14.Display department-wise employee count : "); // done
                System.out.println("15.Display employees of a specific department : "); // done
                System.out.println("16. Exit...");
                System.out.println("Enter the your choice : ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\n-----------------------------------");
                        c.addEmployee();
                        break;
                    case 2:
                        c.displayEmployee();
                        break;
                    case 3:
                        System.out.println("------Search employee by ID--------");
                        System.out.print("Enter the Employee id for the Search: ");
                        int id = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (c.getEmployees()[i].getEmpId() == id) {
                                System.out.println("Employee Found:");
                                System.out.println("Name: " + currentEmp.getEmpName());
                                System.out.println("Salary: " + currentEmp.getTotalSalary());
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee with ID " + id + " not found.");
                        }
                        break;
                    case 4:
                        System.out.println("----------Update employee name------------");
                        System.out.print("Enter the current name of employee to change: ");
                        sc.nextLine();
                        String oldName = sc.nextLine();

                        boolean updated = false;
                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getEmpName().equalsIgnoreCase(oldName)) {
                                System.out.print("Enter new name for this employee: ");
                                String newName = sc.nextLine();
                                currentEmp.setEmpName(newName);

                                System.out.println("Name updated successfully!");
                                updated = true;
                                break;
                            }
                        }

                        if (!updated) {
                            System.out.println("Employee with name '" + oldName + "' not found.");
                        }
                        break;
                    case 5:
                        System.out.println("----------Update employee name------------");
                        System.out.print("Enter the current department name to change: ");
                        sc.nextLine();
                        String oldDeptName = sc.nextLine();

                        boolean updateDept = false;
                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getDept().getDeptName().equalsIgnoreCase(oldDeptName)) {
                                System.out.print("Enter new name for this department: ");
                                String newName = sc.nextLine();
                                currentEmp.getDept().setDeptName((newName));

                                System.out.println("Name updated successfully!");
                                updateDept = true;
                                break;
                            }
                        }

                        if (!updateDept) {
                            System.out.println("department with name '" + oldDeptName + "' not found.");
                        }
                        break;
                    case 6:
                        System.out.println("-----------Delete employee-----------");
                        System.out.print("Enter the Employee ID to delete: ");
                        int deleteId = sc.nextInt();
                        int foundIndex = -1;

                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            if (c.getEmployees()[i].getEmpId() == deleteId) {
                                foundIndex = i;
                                break;
                            }
                        }
                        if (foundIndex != -1) {
                            for (int i = foundIndex; i < c.getEmployeeCount() - 1; i++) {
                                c.getEmployees()[i] = c.getEmployees()[i + 1];
                            }
                            c.getEmployees()[c.getEmployeeCount() - 1] = null;
                            c.setEmployeeCount(c.getEmployeeCount() - 1);

                            System.out.println("Employee deleted successfully.");
                        } else {
                            System.out.println("Employee with ID " + deleteId + " not found.");
                        }
                        break;
                    case 7:
                        System.out.println("\n-----------------------------------");
                        System.out.println("Count the Total Employee is : " + c.getEmployeeCount());
                        break;
                    case 8:
                        System.out.println("---------- Calculate Salary with Bonus ----------");
                        c.calculateSalaryWithBonus();
                        System.out.println("All salaries updated with bonuses based on ratings.");
                        break;
                    case 9:
                        System.out.println("--------Deduct salary for low performance-----");
                        float min = Integer.MAX_VALUE;
                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getRating() < min) {
                                min = currentEmp.getRating();
                            }
                        }

                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getRating() == min) {
                                double sal = currentEmp.getTotalSalary() - currentEmp.getTotalSalary() * 0.10;
                                currentEmp.setTotalSalary(sal);
                                System.out.println("Deduct salary 10% in total salary is successfully");
                            }
                        }
                        break;
                    case 10:
                        System.out.println("----------Display highest salary employee------");
                        double max = 0;
                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getTotalSalary() > max) {
                                max = currentEmp.getTotalSalary();
                            }
                        }

                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getTotalSalary() == max) {
                                System.out.println("Max Salary Employees is : ");
                                System.out.println("Name: " + currentEmp.getEmpId());
                                System.out.println("Name: " + currentEmp.getEmpName());
                                System.out.println("Salary: " + currentEmp.getTotalSalary());
                            }
                        }
                        break;
                    case 11:
                        System.out.println("----------Display lowest salary employee------");
                        double mins = Integer.MAX_VALUE;
                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getTotalSalary() < mins) {
                                mins = currentEmp.getTotalSalary();
                            }
                        }

                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (c.getEmployees()[i].getTotalSalary() == mins) {
                                System.out.println("Max Salary Employees is : ");
                                System.out.println("Name: " + currentEmp.getEmpId());
                                System.out.println("Name: " + currentEmp.getEmpName());
                                System.out.println("Salary: " + currentEmp.getTotalSalary());
                            }
                        }
                        break;
                    case 12:
                        System.out.println("-----------Update employee rating-----------");
                        c.updatePerformance();
                        break;
                    case 13:
                        System.out.println("---------------Promote employee based on rating----------");
                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            for (int j = i + 1; j < c.getEmployeeCount(); j++) {
                                if (c.getEmployees()[i].getRating() < c.getEmployees()[j].getRating()) {
                                    float temp = c.getEmployees()[i].getRating();
                                    c.getEmployees()[i].setRating(c.getEmployees()[j].getRating());
                                    c.getEmployees()[j].setRating(temp);
                                }
                            }
                        }
                        c.displayEmployee();
                        break;
                    case 14:
                        System.out.println("------Display department-wise employee count----");
                        Map<String, Integer> map = new HashMap<>();
                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            map.put(currentEmp.getDept().getDeptName(),
                                    map.getOrDefault(currentEmp.getDept().getDeptName(), 0) + 1);
                        }
                        System.out.println(map);
                        break;
                    case 15:
                        System.out.print("Enter the Department Name: ");
                        sc.nextLine();
                        String deptName = sc.nextLine();
                        found = false;
                        System.out.println("\n--- Listing Employees for Department: " + deptName + " ---");

                        for (int i = 0; i < c.getEmployeeCount(); i++) {
                            Employee currentEmp = c.getEmployees()[i];
                            if (currentEmp.getDept() != null
                                    && currentEmp.getDept().getDeptName().equalsIgnoreCase(deptName)) {
                                found = true;
                                System.out.println("Employee ID is          : " + currentEmp.getEmpId());
                                System.out.println("Employee name is        : " + currentEmp.getEmpName());
                                System.out.println("Employee Rating is      : " + currentEmp.getRating());
                                System.out.println("-------------------------------------------------------");
                            }
                        }
                        if (!found) {
                            System.out.println("No employees found in the '" + deptName + "' department.");
                        }
                        System.out.println("--------------------------------------------------");
                        break;
                    case 16:
                        System.out.println("Exit...");
                        break;
                    default:
                        System.out.println("Enter Invalid Inputs !!!");
                }

            } while (choice != 16);
        }

    }
}
