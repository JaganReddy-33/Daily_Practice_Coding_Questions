import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        reverseDigits(str);
    }

    public static void reverseDigits(String str){
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.lenght-1;

        while(left < right){

            while(left < right && !Character.isDigit(chars[left])){
                left++;
            }

            while(left < right && !Character.isDigit(chars[right])){
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        System.out.print(new String(chars));
    }
}