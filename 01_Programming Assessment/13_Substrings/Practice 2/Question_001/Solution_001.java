import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countNumericSubstrings(input));
    }

    public static int countNumericSubstrings(String input) {
        int n = input.length();
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String sub = input.substring(i, j+1);

                boolean alldigits = true;
                for(int k=0; k<sub.length(); k++){
                    if(!Character.isDigit(sub.charAt(k))){
                        alldigits = false;
                        break;
                    }
                }

                if(alldigits){
                    count++;
                }
            }
        }
        return count;
    }
}