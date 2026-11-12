import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printPalindromicEle(arr, n);
    }

    public static void printPalindromicEle(int[] arr, int n) {
        boolean found = false;

        for(int i=0; i<n; i++) {
            if(isPalindrome(arr[i])){
                System.out.print(arr[i]+" ");
                found = true;
            }
        }
        if(!found){
            System.out.print("-1");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int temp = Math.abs(num);
        int reversed = 0;

        while(temp > 0){
            int digit = temp%10;
            reversed = (reversed*10) + digit;
            temp /= 10;
        }

        int finalReversed = (original < 0) ? -reversed : reversed;
        return original == finalReversed;
    }
}