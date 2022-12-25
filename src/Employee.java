public class Employee {
    String name;
    int workHours;
    int hireYear;
    double oldSalary;

    Employee(String name, int workHours, int hireYear, double oldSalary) {
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.oldSalary = oldSalary;
    }

    void printInfoEmp() {
        System.out.println("************************************");
        System.out.println("          " + this.name);
        System.out.println("************************************");
        System.out.println("Current Salary: " + this.oldSalary + " $");
        System.out.println("Working hours for a week:  " + this.workHours);
        System.out.println("The employement start date: " + this.hireYear);
        System.out.println("************************************");
    }
}
