import java.util.*;


class Employee {
    // Private member variables
    private int empId;
    private String empName;
    private String designation;
    private String email;
    private long phone;
    private double salary;

    // Define getter and setter methods for all attributes
    // Getter and Setter for empId
    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId){
        if(empId > 0){
            this.empId = empId;
        }
    }
    
    // Getter and Setter for empName
    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }
    
    // Getter and Setter for designation
    public String getDesignation(){
        return designation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }
    
    // Getter and Setter for email
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    // Getter and Setter for phone

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone){
        if(String.valueOf(phone).length() == 10){
            this.phone = phone;
        }
    }
    
    // Getter and Setter for salary

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an instance of Employee
        Employee emp= new Employee();
        
        // Take input from the user for all attributes
        // Set the values using setter methods

        emp.setEmpId(sc.nextInt());
        sc.nextLine();
        emp.setEmpName(sc.nextLine());
        emp.setDesignation(sc.nextLine());
        emp.setEmail(sc.nextLine());
        emp.setPhone(sc.nextLong());
        emp.setSalary(sc.nextDouble());

        
        // Print the employee's information using getter methods
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getDesignation());
        System.out.println(emp.getEmail());
        System.out.println(emp.getPhone());
        System.out.println(emp.getSalary());
    }
}