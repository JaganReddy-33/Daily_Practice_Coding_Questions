import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        findLongestConsonantSubstring(input);
    }

    public static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u';
    }

    public static boolean isConsonant(char ch){
        return Character.isLetter(ch) && !isVowel(ch);
    }

    public static void findLongestConsonantSubstring(String input) {
        String longest = "";
        int n = input.length();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String sub = input.substring(i, j+1);

                boolean allConsonant = true;
                for(int k=0; k<sub.length(); k++){
                    if(!isConsonant(sub.charAt(k))){
                        allConsonant = false;
                        break;
                    }
                }

                if(allConsonant){
                    if(sub.length > longest.length()){
                        longest = sub;
                    }
                }
            }
        }
        System.out.print(longest.isEmpty() ? "No consonant substring found" : longest);
    }
}