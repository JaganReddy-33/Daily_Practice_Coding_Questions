import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String str = sc.next();
        char ch = sc.next().charAt(0);
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                if (c < ch) {
                    vowels.add(c);
                }
            }
        }
        
        // If no valid vowels found, print -1
        if (vowels.isEmpty()) {
            System.out.println(-1);
        } else {
            // Sort valid vowels in alphabetical order
            Collections.sort(vowels);
            
            // Print the sorted vowels as a string
            StringBuilder result = new StringBuilder();
            for (char v : vowels) {
                result.append(v);
            }
            System.out.println(result.toString());
        }
    }
}