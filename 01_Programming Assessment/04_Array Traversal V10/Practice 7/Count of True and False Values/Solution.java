import java.util.Scanner;

class Main {

    public static void countBooleanVal(boolean[] arr, int n){
        int trueCount = 0;
        int falseCount = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == true){
                trueCount++;
            } else {
                falseCount++;
            }
        }
        System.out.print(trueCount+" "+falseCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        boolean[] arr = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextBoolean();
        }
        
        countBooleanVal(arr, n);
    }
}