import java.util.*;

public class Main {
    public static void convertFahrenToCelsius(int fahren){
        double celsius = (fahren-32.0)*(5.0/9.0);
        System.out.printf("%.4f\n", celsius);
    }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int fahren = scanner.nextInt();
    convertFahrenToCelsius(fahren);
  }
}