import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        float[] arr = new float[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextFloat();
        }

        for(int i=0; i<n; i++){
            System.out.println("CGPA of student "+(i+1)+" is: "+arr[i]);
        }
    }
}