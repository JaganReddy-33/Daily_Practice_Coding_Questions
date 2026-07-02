import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        for(int i=n2; i>=n1; i--){
            if(i%x==0 && i%y==0){
                System.out.print(i+" ");
            }
        }
    }
}