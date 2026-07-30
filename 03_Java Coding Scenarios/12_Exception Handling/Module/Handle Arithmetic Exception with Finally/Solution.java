import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();

            int res = numerator / denominator;
            System.out.println(res);
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("End of division attempt");
        }
    }
}