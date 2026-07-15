import java.util.Scanner;

public class Main {

    private static String reverseString(String s){
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseString(input));
    }
}