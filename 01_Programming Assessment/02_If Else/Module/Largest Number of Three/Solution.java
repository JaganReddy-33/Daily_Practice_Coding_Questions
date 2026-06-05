import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();

        if(n>m && n>l){
            System.out.print(n);
        } else if(m>l && m>n){
            System.out.print(m);
        } else {
            System.out.print(l);
        }
      
    }
}