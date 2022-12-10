package BankExercise;

public class Bank {
    private int accountNumber;
    private String membersName;
    private double balance;

    public Bank(){

    }
    public Bank(int accountNumber, String membersName){
        this.accountNumber = accountNumber;
        this.membersName = membersName;
    }

    public Bank(int accountNumber, String membersName, double balance){
        this.accountNumber = accountNumber;
        this.membersName = membersName;
        deposit(balance);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMembersName() {
        return membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money){
        this.balance = this.balance + money;
    }

    public void withdraw(double money){
        if (this.balance < money){
            System.out.println("Saldo insuficiente!");
        }
        else
            this.balance = this.balance - money - 5;
    }

    public String toString(){
        return "Account -> " + getAccountNumber() + "\nHolder -> " + getMembersName() + "\nBalance -> " + getBalance();
    }
}
