import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int n = str1.compareToIgnoreCase(str2);
        if(n > 0){
            System.out.print("The first string is greater.");
        } else if(n < 0){
            System.out.print("The second string is greater.");
        } else {
            System.out.print("Both strings are equal.");
        }
    }
}