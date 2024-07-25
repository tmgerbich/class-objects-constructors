public class BankAccount {
    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println("" + this.name + "'s account balance: " + this.balance);
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

}
