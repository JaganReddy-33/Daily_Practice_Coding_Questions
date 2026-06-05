import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = countDigits(num);
        System.out.println(count);
    }

    public static int countDigits(int num) {
        // Your logic here
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}