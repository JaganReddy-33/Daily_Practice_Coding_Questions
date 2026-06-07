import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        int smallValue = (n<m) ? n : m;

        for(int i=3; i<=smallValue; i++){
            if(n%i==0 && m%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}