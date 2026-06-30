import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        boolean isEven = false;
        for(int i=n; i>=1; i--){
            if(i%2 == 0){
                System.out.print(i+" ");
                isEven = true;
            }
        }
        if(!isEven){
            System.out.print("None")
        }
        
    }
}