import java.util.*;

public class Main {

    public static void removeDuplicates(String input){
        Set<Character> seen = new LinkedHashSet<>();
        for(char ch : input.toCharArray()){
            seen.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : seen){
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        removeDuplicates(input);
    }


}