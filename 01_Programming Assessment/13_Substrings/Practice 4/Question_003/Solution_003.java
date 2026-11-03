import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();

        extractCharsFromFirstandLast(str, n);
    }

    public static void extractCharsFromFirstandLast(String input, int n) {
        String firstPos = "";
        String lastPos = "";

        for(int i=0; i<n; i++){
            firstPos += input.charAt(i);
        }

        int len = input.length();
        for(int j=len-n; j<len; j++){
            lastPos += input.charAt(j);
        }

        System.out.print(firstPos + lastPos);
    }
}