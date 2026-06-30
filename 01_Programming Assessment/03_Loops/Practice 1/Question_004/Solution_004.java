import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        boolean isFount = false;
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");
                isFount = true;
            }
        }
        if(!isFount){
            System.out.print(-1);
        }
    }
}