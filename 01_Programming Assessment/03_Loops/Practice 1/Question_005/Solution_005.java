import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        boolean isFound = false;
        for(int i=n; i>=1; i--){
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");
                isFound = true;
            }
        }

        if(!isFound){
            System.out.print(-1);
        }
    }
}