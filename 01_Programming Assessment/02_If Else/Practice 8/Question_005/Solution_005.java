import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String hasVoterCard = scanner.next();
        if(age >= 18){
            if(hasVoterCard.equalsIgnoreCase("Yes")){
                System.out.print("Eligible and can Vote");
            } else {
                System.out.print("Get a voter ID");
            }
        } else {
            System.out.print("Not Eligible to Vote");
        }
    }
}