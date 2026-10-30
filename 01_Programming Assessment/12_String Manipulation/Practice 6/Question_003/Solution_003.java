import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        asciiSumConcatenator(str);
    }

    public static void asciiSumConcatenator(String s){
        int asciiSum = 0;

        for(int i=0; i<s.length(); i++){
            asciiSum += s.charAt(i);
        }

        System.out.print(s + asciiSum);
    }
}