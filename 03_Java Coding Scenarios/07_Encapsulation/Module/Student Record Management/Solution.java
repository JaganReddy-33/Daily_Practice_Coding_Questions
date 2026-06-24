import java.util.*;

class Student {
    // Private member variables
    private int id;
    private String name;
    private int age;
    private String grade;

    // Getter and setter methods for id
    public int getStdId(){
        return id;
    }
    public void setStdID(int id){
        if(id > 0){
            this.id = id;
        }
    }

    // Getter and setter methods for name
    public String getStdName(){
        return name;
    }
    public void setStdName(String name){
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    // Getter and setter methods for age
    public int getStdAge(){
        return age;
    }
    public void setStdAge(int age){
        if(age > 1 && age < 100){
            this.age = age;
        }
    }

    // Getter and setter methods for grade
    public String getStdGrade(){
        return grade;
    }

    public void setStdGrade(String grade){
        if(!grade.isEmpty()){
            this.grade = grade;
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Create a Student object
        Student std = new Student();

        // Take input for all the attributes using setter methods
        std.setStdID(sc.nextInt());
        sc.nextLine();
        std.setStdName(sc.nextLine());
        std.setStdAge(sc.nextInt());
        std.setStdGrade(sc.next());

        // Display the student's information using getter methods
        System.out.println(std.getStdId());
        System.out.println(std.getStdName());
        System.out.println(std.getStdAge());
        System.out.println(std.getStdGrade());
    }
}