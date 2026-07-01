import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();

        for(int i=n2; i>=n1; i--){
            if(i%3==0 || i%5==0 || i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}