import java.util.*;

public class Main {

    public static void uniqueChars(String str){
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char c: set){
            sb.append(c);
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        uniqueChars(str);
    }
}