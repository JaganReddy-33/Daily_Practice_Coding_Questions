import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        findLongestNumericSubstring(input);
    }

    public static void findLongestNumericSubstring(String input) {
        String longest = "";
        int n = input.length();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String sub = input.substring(i, j+1);

                boolean allNumerics = true;
                for(int k=0; k<sub.length(); k++){
                    if(!Character.isDigit(sub.charAt(i))){
                        allNumerics = false;
                        break;
                    }
                }
                if(allNumerics){
                    if(sub.length()  > longest.length()){
                        longest = sub;
                    }
                }
            }
        }
        System.out.print(longest.isEmpty() ? "No numeric substring found" : longest);
    } 
}