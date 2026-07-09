import java.util.*;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


    public double getAnnualSalary() {
        return this.salary * 12;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    // Getters and Setters
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    @Override
    public double getAnnualSalary() {
        return (super.getAnnualSalary() + this.bonus);
    }
}

class Engineer extends Employee {
    private double overtime;

    public Engineer(String name, double salary, double overtime ){
        super(name, salary);
        this.overtime = overtime;
    }

    // Getters and Setters
    public double getOvertime(){
        return overtime;
    }
    public void setOvertime(double overtime){
        this.overtime = overtime;
    }

    @Override
    public double getAnnualSalary() {
        return (super.getAnnualSalary() + this.overtime);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String employType =sc.nextLine().trim();
        String detailsLine = sc.nextLine().trim();
        String[] arr = detailsLine.split(",");

        String name = arr[0];
        double salary = Double.parseDouble(arr[1]);

        if(employType.equalsIgnoreCase("Manager")){
            double bonus = Double.parseDouble(arr[2]);
            Manager manager = new Manager(name, salary, bonus);
            System.out.printf("Annual Salary of Manager: %.2f\n", manager.getAnnualSalary());
        } else if(employType.equalsIgnoreCase("Engineer")){
            double overtime = Double.parseDouble(arr[2]);
            Engineer engineer = new Engineer(name, salary, overtime);
            System.out.printf("Annual Salary of Engineer: %.2f\n", engineer.getAnnualSalary());
        }
    }
}