import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        swapCharacterPairs(str);
    }

    public static void swapCharacterPairs(String str) {
        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length-1; i+=2) {
            char temp = chars[i];
            chars[i] = chars[i+1];
            chars[i+1] = temp;
        }
        System.out.print(new String(chars));
    }
}