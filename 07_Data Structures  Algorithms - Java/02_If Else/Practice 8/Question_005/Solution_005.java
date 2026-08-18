import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String hasVoterCard = scanner.next();
        
        System.out.println(age<18?"Not Eligible to Vote":hasVoterCard.equalsIgnoreCase("Yes")?"Eligible and can Vote":"Get a Voter ID");
    }
}