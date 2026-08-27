import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNext()) return;
        String s=sc.next();
        if(!sc.hasNext()) return;
        char ch=sc.next().charAt(0);
        System.out.println(process(s,ch));
    }

    public static String process(String s,char ch) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(isVowel(c)&&c<ch) {
                list.add(c);
            }
        }
        if(list.isEmpty()) return "-1";
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        for(char c:list) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}