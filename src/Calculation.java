public class Calculation {
    Employee employee;

    Calculation(Employee employee) {
        this.employee = employee;
    }

    double totalBonusTax() {
        return ((this.employee.oldSalary + bonus()) - tax());
    }

    double totalCurrentSalary() {
        return totalBonusTax() + raiseSalary();
    }

    double tax() {
        double rateTax = 0.03;
        if (this.employee.oldSalary > 6000) {
            return this.employee.oldSalary * rateTax;
        }
        return 0;
    }

    int bonus() {
        if (this.employee.workHours > 40) {
            int bonus = 30;
            return (this.employee.workHours - 40) * bonus;
        }
        return 0;
    }

    double raiseSalary() {
        int thisYear = 2022;
        int difYear;
        double incRate, result;
        difYear = (thisYear - this.employee.hireYear);
        if (difYear < 10) {
            incRate = 0.05;
            result = employee.oldSalary * incRate;
            return result;
        } else if (difYear < 20) {
            incRate = 0.1;
            result = employee.oldSalary * incRate;
            return result;
        }
        incRate = 0.15;
        result = employee.oldSalary * incRate;
        return result;
    }

    void printInfo() {
        employee.printInfoEmp();
        System.out.println("Tax: " + tax() + " $");
        System.out.println("Your bonus earnings: " + bonus() + " $");
        System.out.println("The increase in your salary: " + raiseSalary() + " $");
        System.out.println("Your current salary with bonus and taxes: " + totalBonusTax() + " $");
        System.out.println("Your current monthly salary: " + totalCurrentSalary() + " $");
    }
}
