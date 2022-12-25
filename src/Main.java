public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Kevin Stuart", 50, 2021, 9000);
        Employee employeeTwo = new Employee("Klara Jobs", 35, 1997, 35000);

        Calculation calculateOne = new Calculation(employeeOne);
        calculateOne.printInfo();
        Calculation calculationTwo = new Calculation(employeeTwo);
        calculationTwo.printInfo();
    }
}
