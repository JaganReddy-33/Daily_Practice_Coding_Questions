public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        long sum = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                if(digit%2 == 0){
                    sum += digit;
                }
            }
        }
        System.out.print(sum);
    }
}