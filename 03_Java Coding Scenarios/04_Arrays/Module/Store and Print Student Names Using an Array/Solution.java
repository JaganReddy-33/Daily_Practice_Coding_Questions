import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.next();
        }

        for(int i=0; i<n; i++){
            System.out.println("Student at index "+i+" is: "+arr[i]);
        }
    }
}