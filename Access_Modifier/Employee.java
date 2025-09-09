package Bridgelabz.oops.Access_Modifier;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 85000, 10);
        m.displayDetails();
        m.setSalary(95000);
        m.displayDetails();
    }
}
