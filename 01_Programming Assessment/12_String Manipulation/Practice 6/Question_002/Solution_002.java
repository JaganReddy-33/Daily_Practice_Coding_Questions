import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        numericASCIIReplacer(str);
    }

    public static void numericASCIIReplacer(String s ){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                sb.append((int) ch);
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.print(sb.toString());

    }
}