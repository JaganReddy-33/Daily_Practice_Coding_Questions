import java.util.Scanner;

class BankAccount{

    private String accountNumber;
    private String accountHolder;
    private float balance;
    private String accountType;


    public void setNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void SetBalance(float balance){
        this.balance = balance;
    }
    public void setType(String accountType){
        this.accountType = accountType;
    }

    public String getNumber(){
        return accountNumber;
    }
    public String getHolder(){
        return accountHolder;
    }
    public float getBalance(){
        return balance;
    }
    public String getType(){
        return accountType;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount ba = new BankAccount();

        ba.setNumber(sc.nextLine());
        ba.setHolder(sc.nextLine());
        ba.SetBalance(Float.parseFloat(sc.nextLine()));
        ba.setType(sc.nextLine());

        System.out.println(ba.getNumber());
        System.out.println(ba.getHolder());
        System.out.println(ba.getBalance());
        System.out.println(ba.getType());
        
    }
}