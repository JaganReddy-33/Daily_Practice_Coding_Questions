import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        consonantASCIIReplacer(str);
    }

    public static void consonantASCIIReplacer(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetter(ch) && !isVowel(ch)){
                sb.append((int) ch);
            } else {
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }

    public static boolean isVowel(char ch){
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh=='a' || lowerCh=='e' || lowerCh=='i' || lowerCh=='o' || lowerCh=='u';
    }
}