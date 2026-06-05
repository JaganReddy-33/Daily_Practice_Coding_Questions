import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ages = new int[N];

        for(int i=0; i< N; i++){
            ages[i] = scanner.nextInt();        
        }

        System.out.print("Ages are: ");
        for(int i=0; i<N; i++){
            System.out.print(ages[i]+" ");
            if(i<N-1){
                System.out.print(" ");
            }
        }
    }
}