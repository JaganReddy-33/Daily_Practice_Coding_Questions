import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        substringsWithAandB(s);
    }

    public static void substringsWithAandB(String s) {
        int totalCount = 0;
        int lastA = -1;
        int lastB = -1;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A') {
                lastA = i;
            } else if(ch == 'B') {
                lastB = i;
            }

            if(lastA != -1 && lastB != -1) {
                totalCount += Math.min(lastA, lastB)+1;
            }
        }
        System.out.print(totalCount);
    }
}