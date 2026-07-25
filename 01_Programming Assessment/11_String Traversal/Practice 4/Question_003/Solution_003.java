import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        String s = "";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == ch){
                break;
            } else {
                s = s + c;
            }
        }
        System.out.print(s);
    }
}