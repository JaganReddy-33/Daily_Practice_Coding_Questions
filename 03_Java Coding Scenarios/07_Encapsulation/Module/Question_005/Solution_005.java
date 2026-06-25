import java.util.Scanner;

class Employee{

    private int empID;
    private String name;
    private String dept;
    private float salary;

    public void setEmpID(int empID){
        this.empID = empID;
    }
    public int getEmpID(){
        return empID;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDept(String dept){
        this.dept = dept;
    }
    public String getDept(){
        return dept;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(){
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       Employee emp = new Employee();

       emp.setEmpID(Integer.parseInt(sc.nextLine()));
       emp.setName(sc.nextLine());
       emp.setDept(sc.nextLine());
       emp.setSalary(Float.parseFloat(sc.nextLine()));

       System.out.println(emp.getEmpID());
       System.out.println(emp.getName());
       System.out.println(emp.getDept());
       System.out.println(emp.getSalary());

    }
}