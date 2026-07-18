import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.length() == 0){
            System.out.print("No");
            return;
        }

        int count = 0;
        for(int i=0; i<input.length(); i++){
            char ch = Character.toLowerCase(input.charAt(i));

            if(Character.isLetter(ch)){
                if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
                    count++;
                }
            }
        }
        System.out.print((input.length()== count) ? "Yes" : "No");
    }
}