import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        double[] arr = new double[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextDouble();
        }

        for(int i=0; i<n; i++){
            System.out.println("Temperature of city "+(i+1)+" is: "+ arr[i]);
        }
    }
}