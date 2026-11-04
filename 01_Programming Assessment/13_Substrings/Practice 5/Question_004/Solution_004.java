import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();
        
        longestSubstringWithKUniqueChars(str, k);
    }

    public static void longestSubstringWithKUniqueChars(String input, int k) {
        int n = input.length();
        if (n == 0 || k == 0) {
            System.out.print(-1);
            return;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        int maxLen = -1;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char rightChar = input.charAt(right);
            charCountMap.put(rightChar, charCountMap.getOrDefault(rightChar, 0) + 1);

            while (charCountMap.size() > k) {
                char leftChar = input.charAt(left);
                charCountMap.put(leftChar, charCountMap.get(leftChar) - 1);
                if (charCountMap.get(leftChar) == 0) {
                    charCountMap.remove(leftChar);
                }
                left++;
            }

            if (charCountMap.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.print(maxLen);
    }
}