import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = scanner.next().charAt(0);

        String s = "";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == ch){
                s = s + "*";
            } else{
                s = s+c;
            }
        }
        System.out.print(s);
    }
}