import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);
        
        String s = "";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == ch1){
                s += ch2;
            } else {
                s += c;
            }
        }
        System.out.print(s);
    }
}