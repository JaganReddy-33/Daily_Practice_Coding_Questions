import java.util.Scanner;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){ 
      return name; 
    }
    public void setName(String name){ 
      this.name=name;
     }

    public int getAge(){ 
      return age; 
    }
    public void setAge(int age){
      this.age=age; 
    }

    public String getDetails(){
        return "Name: "+name+", Age: "+age;
    }
}

class Employee extends Person{
    public String employeeID;

    public Employee(String name, int age, String employeeID){
        super(name, age);
        this.employeeID=employeeID;
    }

    public String getEmployeeID(){ 
      return employeeID; 
    }
    public void setEmployeeID(String employeeID){ 
      this.employeeID=employeeID; 
    }

    @Override
    public String getDetails(){
        return super.getDetails()+", Employee ID: "+employeeID;
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name,int age, String employeeID, String department){
        super(name,age, employeeID);
        this.department=department;
    }

    public String getDepartment(){ 
      return department; 
    }
    public void setDepartment(String department){ 
      this.department=department; 
    }

    @Override
    public String getDetails(){
        return super.getDetails()+", Department: "+department;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String[] details=sc.nextLine().split(",");

        if(details.length== 4){
         String name = details[0].trim();
          int age = Integer.parseInt(details[1].trim());
          String employeeID = details[2].trim();
          String department = details[3].trim();

          Manager manager = new Manager(name, age, employeeID, department);
          System.out.println("Manager Details: "+manager.getDetails());
        }
    }
}