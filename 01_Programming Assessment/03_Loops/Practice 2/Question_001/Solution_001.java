import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        boolean isFound = false;
        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }
        if(!isFound){
            System.out.print(-1);
        }
    }
}