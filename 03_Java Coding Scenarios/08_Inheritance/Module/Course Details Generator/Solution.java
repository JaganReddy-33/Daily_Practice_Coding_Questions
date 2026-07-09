import java.util.*;

class Course {
  private String courseName;
  private String courseCode;

  public Course(String courseName, String courseCode){
    this.courseName = courseName;
    this.courseCode = courseCode;
  }

  public String getName(){
    return courseName;
  }
  public void setName(String courseName){
    this.courseName = courseName;
  }

  public String getCode(){
    return courseCode;
  }
  public void setCode(String courseCode){
    this.courseCode = courseCode;
  }

  public String getDetails(){
    return "Course Name: "+ courseName + ", Course Code: " + courseCode;
  }
}

class OnlineCourse extends Course {
  private String platform;

  public OnlineCourse(String courseName, String courseCode, String platform){
    super(courseName, courseCode);
    this.platform = platform;
  }

  public String getPlatfor(){
    return platform;
  }
  public void setPlatform(String platform){
    this.platform = platform;
  }

  public String getDetails(){
    return (super.getDetails())+", Platform: "+platform;
  }
}

class OfflineCourse extends Course {
  private String location;

  public OfflineCourse(String courseName, String courseCode, String location){
    super(courseName, courseCode);
    this.location = location;
  }
  public String getLocation(){
    return location;
  }
  public void setLocation(String location){
    this.location = location;
  }

  public String getDetails(){
    return (super.getDetails())+", Location: "+location;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String type = scanner.nextLine().trim();
    String input = scanner.nextLine().trim();

    String[] arr = input.split(",");
    String courseName = arr[0];
    String courseCode = arr[1];

    if(type.equalsIgnoreCase("OnlineCourse")){
      String platform = arr[2];
      OnlineCourse online = new OnlineCourse(courseName, courseCode, platform);
      System.out.print("Course Details: "+online.getDetails());
    } else if(type.equalsIgnoreCase("OfflineCourse")){
      String location = arr[2];
      OfflineCourse offline = new OfflineCourse(courseName, courseCode, location);
      System.out.print("Course Details: "+offline.getDetails());
    }

  }
}