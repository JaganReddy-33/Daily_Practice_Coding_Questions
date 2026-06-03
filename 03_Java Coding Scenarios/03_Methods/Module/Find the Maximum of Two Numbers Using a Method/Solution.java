import java.util.Scanner;

class Main {
    public static int maxNumber(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b =scanner.nextInt();

        int result = maxNumber(a, b);
        System.out.print(result);

    }

   
}