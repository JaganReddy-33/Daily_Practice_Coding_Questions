import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.print((input.length() == count) ? "Yes" : "No");
    }
}