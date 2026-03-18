package OOP;

public class EmployeeSalary {
    private double salary;
    private int bonus;
    public EmployeeSalary(double salary,int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public double bonusWithSalary() {
        double increment = salary*bonus/100;
        this.salary = salary + increment;
        return salary;
    }
    public static void main(String[] args) {
        EmployeeSalary employeeSalary = new EmployeeSalary(2500,10);
        System.out.println(employeeSalary.bonusWithSalary());

    }
}
